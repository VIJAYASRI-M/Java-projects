package com.example.springboot.repo;

import com.example.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate template;
    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Student student) {
        String sql = "insert into students values(?,?,?)";
        template.update(sql,student.getId(),student.getName(),student.getMarks());
    }

    public List<Student> findAll() {
        String sql = "select * from students";
        RowMapper<Student> mapper=(rs,rowNum) ->
        {
            Student s=new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        };
        return template.query(sql,mapper);
    }
}

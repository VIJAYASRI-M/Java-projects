package com.example.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        return "Student.jsp";
    }

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int result = Integer.parseInt(req.getParameter("num1")) + Integer.parseInt(req.getParameter("num1"));
//        session.setAttribute("result",result);
//        return "Result.jsp";
//    }

    @RequestMapping("/add")
    public ModelAndView add(int num1, int num2, ModelAndView model){
        int result = num1+num2;
//        model.addAttribute("result",result);
        model.addObject("result",result);
        model.setViewName("Result.jsp");
        return model;
    }

//    @RequestMapping("/addStudent")
//    public ModelAndView addStudent(int id, String name, ModelAndView model){
//        Student st = new Student();
//        st.setId(id);
//        st.setName(name);
//        model.addObject("result",st);
//        model.setViewName("Result.jsp");
//        return model;
//    }

    @RequestMapping("/addStudent")
    public String addStudent(@ModelAttribute("result") Student student){
        return "Result.jsp";
    }

}

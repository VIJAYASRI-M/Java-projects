package Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Programmer {

    private int age;
    private Computer computer;

    @ConstructorProperties({"age","computer"})
    @Autowired
    public Programmer(@Value("0") int age,
                      @Qualifier("laptop")Computer computer) {
        this.age = age;
        this.computer = computer;
    }

    public void work(){
        System.out.println("coding");
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

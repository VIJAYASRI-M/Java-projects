package Models;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public Laptop() {
        System.out.println("Laptop Object created");
    }

    @Override
    public void compile(){
        System.out.println("compiling using laptop");
    }
}

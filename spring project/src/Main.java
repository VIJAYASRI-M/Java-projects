import Models.Computer;
import Models.Desktop;
import Models.Programmer;
import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Computer desktop = (Desktop) context.getBean("desktop");
        Programmer programmer = context.getBean(Programmer.class);

        desktop.compile();
        programmer.work();
        System.out.println(programmer.getAge());
        programmer.getComputer().compile();

    }
}
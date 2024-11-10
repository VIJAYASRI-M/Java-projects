package config;

import Models.Computer;
import Models.Desktop;
import Models.Laptop;
import Models.Programmer;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("Models")
public class AppConfig
{
//    @Bean(name = {"desktop","com1"})
//    @Scope(value = "prototype")
//    public Computer desktop(){
//        return new  Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Computer laptop(){
//        return new Laptop();
//    }
//
//
//    @Bean
//    public Programmer programmer(Computer com){ //@Qualifier("Laptop")
//        return new Programmer(25, com);
//    }

}

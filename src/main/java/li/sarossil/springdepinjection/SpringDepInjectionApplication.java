package li.sarossil.springdepinjection;

import li.sarossil.springdepinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDepInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDepInjectionApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        String res = myController.sayHi();

    }

}

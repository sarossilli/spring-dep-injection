package li.sarossil.springdepinjection;

import li.sarossil.springdepinjection.controllers.ConstructorController;
import li.sarossil.springdepinjection.controllers.MyController;
import li.sarossil.springdepinjection.controllers.PropertyInjectedController;
import li.sarossil.springdepinjection.controllers.SetterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDepInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDepInjectionApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        String res = myController.sayHi();

        System.out.println("----------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------- Setter");
        SetterController setterController = (SetterController) ctx.getBean("setterController");
        System.out.println(setterController.getGreeting());

        System.out.println("----------- Constructor");
        ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
        System.out.println(constructorController.getGreeting());

    }

}

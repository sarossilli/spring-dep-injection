package li.sarossil.springdepinjection;

import li.sarossil.springdepinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDepInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDepInjectionApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("----------- My Controller I18N");
        System.out.println(i18nController.sayHello());

        System.out.println("----------- My Controller Primary");
        System.out.println(myController.sayHello());


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

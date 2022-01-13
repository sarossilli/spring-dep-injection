package li.sarossil.springdepinjection;

import li.sarossil.springdepinjection.controllers.*;
import li.sarossil.springdepinjection.services.PrototypeBean;
import li.sarossil.springdepinjection.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class SpringDepInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDepInjectionApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println("----------- petController");
        System.out.println(petController.bestPet());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("----------- My Controller I18N");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");
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


        System.out.println("Singleton Tests");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);

        System.out.println(singletonBean1.getMyScope()); //Singelton is constructed once
        System.out.println(singletonBean2.getMyScope());

        System.out.println("Prototype Tests");
        PrototypeBean protoBean1 = ctx.getBean(PrototypeBean.class);
        PrototypeBean protoBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(protoBean1.getMyScope());
        System.out.println(protoBean2.getMyScope()); // Prototypes are constructed whenever its needed

    }

}

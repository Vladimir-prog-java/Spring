package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.ServiceCoffeeImpl;
@ComponentScan ({"ru.itsjava"})
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        context.getBean(ServiceCoffeeImpl.class).getCoffee();

    }
}

package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.ServiceCoffeeImpl;

public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(ServiceCoffeeImpl.class).getCoffee();

    }
}

package ru.itsjava;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itsjava.service.ServiceCoffeeImpl;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(ServiceCoffeeImpl.class).getCoffee();
        context.close();
    }
}

package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.itsjava.dao.DaoCoffee;
import ru.itsjava.dao.DaoCoffeeImpl;
import ru.itsjava.service.ServiceCoffee;
import ru.itsjava.service.ServiceCoffeeImpl;

@EnableAspectJAutoProxy
@ComponentScan({"ru.itsjava"})
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println(context.getBean(DaoCoffee.class).getCoffeeById(3));

    }
}

package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.itsjava.dao.CoffeeDao;

@EnableAspectJAutoProxy
@ComponentScan({"ru.itsjava"})
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        System.out.println(context.getBean(CoffeeDao.class).getCoffeeById(1));

    }
}

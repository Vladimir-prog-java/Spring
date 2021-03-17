package ru.itsjava.dao;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Coffee;

@Repository
public class CoffeeDaoImpl implements CoffeeDao {


    @Override
    public Coffee getCoffeeById(long coffeeId) {
        System.out.println("Это DaoCoffee");
        if (coffeeId == 1) {
            return new Coffee("Эспрессо");
        }
        if (coffeeId == 2) {
            return new Coffee("Американо");
        }
        if (coffeeId == 3) {
            return new Coffee("Капучино");
        } else return null;
    }
}

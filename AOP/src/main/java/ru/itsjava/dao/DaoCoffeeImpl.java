package ru.itsjava.dao;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Coffee;
@Repository
public class DaoCoffeeImpl implements DaoCoffee{
    @Override
    public Coffee getCofeeById(long coffeeId) {
        return new Coffee("Капучино");
    }
}

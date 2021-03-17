package ru.itsjava.dao;

import ru.itsjava.domain.Coffee;

public interface CoffeeDao {
    Coffee getCoffeeById(long coffeeId);
}

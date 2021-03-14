package ru.itsjava.dao;

import ru.itsjava.domain.Coffee;

public interface DaoCoffee {
    Coffee getCoffeeById(long coffeeId);
}

package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

public interface CoffeeService {
    Coffee getCoffee();
    Coffee getCoffeeById(long id);
}

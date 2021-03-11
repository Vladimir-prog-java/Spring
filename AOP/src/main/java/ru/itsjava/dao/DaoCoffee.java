package ru.itsjava.dao;

import ru.itsjava.domain.Coffee;

public interface DaoCoffee {
    Coffee getCofeeById(long coffeeId);
}

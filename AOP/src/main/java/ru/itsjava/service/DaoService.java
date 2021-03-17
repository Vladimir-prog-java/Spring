package ru.itsjava.service;

import ru.itsjava.domain.Coffee;

public interface DaoService {
    Coffee getCoffeeById(long id);
}

package ru.itsjava.service;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.CoffeeDao;
import ru.itsjava.domain.Coffee;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {
    private final MenuService menuService;
    private final ScannerService scannerService;
   private final CoffeeDao coffeeDao;

    @SneakyThrows
    @Override
    public Coffee getCoffee() {
        menuService.menu("price.txt");

        Coffee coffee;
        while (true) {
            int price = scannerService.readPrice();
            if (price == 70) {
                coffee = new Coffee("Эспрессо");
                System.out.println("Вы выбрали " + coffee);
                System.out.print("Спасибо за Ваш заказ!");
                System.out.println();
                return coffee;
            } else if (price == 90) {
                coffee = new Coffee("Американо");
                System.out.println("Вы выбрали " + coffee);
                System.out.print("Спасибо за Ваш заказ!");
                return coffee;
            } else if (price == 110) {
                coffee = new Coffee("Капучино");
                System.out.println("Вы выбрали " + coffee);
                System.out.print("Спасибо за Ваш заказ!");
                return coffee;
            } else {
                System.out.println("Выберите снова!");
            }
        }
    }

    public Coffee getCoffeeById(long id) {
        return coffeeDao.getCoffeeById(id);
    }
}

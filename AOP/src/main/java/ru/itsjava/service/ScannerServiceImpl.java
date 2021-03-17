package ru.itsjava.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ScannerServiceImpl implements ScannerService {

    @Override
    public int readPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите стоимость");
        return scanner.nextInt();
    }
}

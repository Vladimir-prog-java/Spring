package ru.itsjava.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ServiceScannerImpl implements ServiceScanner {

    @Override
    public int readPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите стоимость");
        return scanner.nextInt();
    }
}

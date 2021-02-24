package ru.itsjava.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ServiceMenuImpl implements ServiceMenu {

    @Override
    @SneakyThrows
    public void menu(String fileName) {
        try (BufferedReader menu = Files.newBufferedReader(Paths.get(fileName))) {
            String text;
            while ((text = menu.readLine()) != null) {
                System.out.println(text);
            }
        }
    }
}

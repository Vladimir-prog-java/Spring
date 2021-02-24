package ru.itsjava.service;

import lombok.SneakyThrows;
import ru.itsjava.App;


import java.io.BufferedReader;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ServiceMenuImpl implements ServiceMenu {

    @Override
    @SneakyThrows
    public void menu(String fileName) {
        // try (BufferedReader menu = Files.newBufferedReader(Paths.get(fileName))) {
        InputStream menu = Files.class.getResourceAsStream("src/main/resources/price.txt");

//        String text;
//        while ((text = menu) != null) {
//            System.out.println(text);
//        }

//        InputStream in = Test.class.getResourceAsStream("app.properties");
//
//        Properties config = new Properties();
//        try {
//            config.load(in);
//            System.out.println(config.getProperty("name"));
//            System.out.println(config.getProperty("version"));

        while (menu != null) {
            System.out.println(menu);
        }


    }
}


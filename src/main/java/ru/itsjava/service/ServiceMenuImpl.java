package ru.itsjava.service;

import lombok.SneakyThrows;
import ru.itsjava.App;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class ServiceMenuImpl implements ServiceMenu {

    @Override
    @SneakyThrows
    public void menu(String fileName) {
        // try (BufferedReader menu = Files.newBufferedReader(Paths.get(fileName))) {

    ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("/price.txt");
       // Scanner s = new Scanner(inputStream);
    //    String menu = s.toString();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String menu = bufferedReader.toString();

//        String data = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
//        InputStream menu = ServiceMenu.class.getResourceAsStream(fileName);
//        Properties properties = new Properties();
//        properties.load(menu);
        String text;
        while ((text = menu) != null) {
            System.out.println(text);
        }

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


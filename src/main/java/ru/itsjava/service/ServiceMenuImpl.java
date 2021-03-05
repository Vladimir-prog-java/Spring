package ru.itsjava.service;

import lombok.SneakyThrows;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
public class ServiceMenuImpl implements ServiceMenu {

    @Override
    @SneakyThrows
    public void menu(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            System.out.println(text);
        }
    }
}


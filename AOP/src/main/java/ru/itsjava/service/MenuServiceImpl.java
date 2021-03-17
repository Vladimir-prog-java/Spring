package ru.itsjava.service;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
public class MenuServiceImpl implements MenuService {

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


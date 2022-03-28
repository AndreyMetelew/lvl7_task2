package com.task;

/* 1. 5 различных строчек в списке
1) Создай список строк.
2) Добавь в него 5 различных строчек.
3) Выведи его размер на экран.
4) Используя цикл, выведи его содержимое на экран, каждое значение с новой строки. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class fiveStrings {
    fiveStrings() throws IOException {
        ArrayList<String> list = new ArrayList<>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        System.out.println();
        System.out.println("Задание №1: Нужно ввести 5 строк в массив и вывести кол-во строк и содержимое массива с новой строки.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            String s = reader.readLine();
            list.add(s);
        }

        System.out.println();
        System.out.println("Размер нашего массива строк: " + list.size());

        System.out.println();
        System.out.println("Введенные нами строки с новой строки:");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}

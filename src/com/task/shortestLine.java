package com.task;

/* 3. Самая короткая строка:
1) Создай список строк.
2) Считай с клавиатуры 5 строк и добавь в список.
3) Используя цикл, найди самую короткую строку в списке.
4) Выведи найденную строку на экран.
5) Если таких строк несколько, выведи каждую с новой строки. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class shortestLine {
    shortestLine () throws IOException {
        ArrayList<String> list = new ArrayList<>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        System.out.println();
        System.out.println("Задание №3: Нужно ввести 5 строк в массив, найти самую короткую и вывести ее." +
                "\nЕсли строк несколько - каждую нужно вывести с новой строки");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            String s = reader.readLine();
            list.add(s);
        }

        System.out.println();
        int minLength = list.get(0).length();
        int index = 0;
        System.out.println("Произвожу поиск самых коротких строк в списке...");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLength) {
                minLength = list.get(i).length();
                index = i;
            }
        }
        System.out.println("Самая короткая строка: \"" + list.get(index) + "\", её номер: " + (index + 1) + ", ее длина: " + minLength);

        System.out.println();
        System.out.println("Все строки данной длины:");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minLength)
                System.out.println("\"" + list.get(i) + "\", строка №" + (i + 1));
        }
    }
}

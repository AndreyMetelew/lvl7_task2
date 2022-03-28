package com.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        // Вывод задания №1
        fiveStrings task1 = new fiveStrings();

        // Вывод задания №2
        longestLine task2 = new longestLine();

        // Вывод задания №3
        shortestLine task3 = new shortestLine();

        /* 4. 10 строчек в начало списка:
           1) Создай список строк в методе main.
           2) Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
           3) Используя цикл, выведи содержимое на экран, каждое значение с новой строки. */

        ArrayList<String> list = new ArrayList<>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        System.out.println();
        System.out.println("Задание №3: Нужно ввести 10 строк в начало массива и выведи содержимое списка на экран, каждое значение с новой строки.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Текст №" + (i + 1) + ": ");
            String s = reader.readLine();
            list.add(0, s);
        }

        System.out.println();
        System.out.println("Мы вставляли каждую строку в начало массива, каждый раз, когда вы их вводили.\nВот как они сохранились:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Строка №" + (i + 1) + ", её значение: \"" + list.get(i) + "\"");
        }
        System.out.println();

        // Вывод задания №5
        fromLastStringToFirst task5 = new fromLastStringToFirst();
    }

}
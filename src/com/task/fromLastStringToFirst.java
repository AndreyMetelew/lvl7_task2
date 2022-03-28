package com.task;

/* 5. Удали последнюю строку и вставь её в начало
1) Создай список строк.
2) Добавь в него 5 строчек с клавиатуры.
3) Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4) Используя цикл, выведи содержимое на экран, каждое значение с новой строки. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class fromLastStringToFirst {
    fromLastStringToFirst () throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        System.out.println();
        System.out.println("Задание №5: Нужно ввести 5 строк в массив, удалить последнюю строку и вставить ее в начало." +
                "\nВсё это повторить 13 раз, а после вывести содержимое на экран с новой строки");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка №" + (i + 1) + ": ");
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < 13; i++) {
            int index = list.size();
            String s = list.get(index - 1);
            list.remove(index - 1);
            list.add(0, s);
        }

        System.out.println();
        System.out.println("Последняя строка удалена и вставлена в начало списка 13 раз.\nВот каким стал массив после перетасовки:");
        for (int i = 0; i < list.size(); i++)
            System.out.println("Строка №" + (i + 1) + ": " + list.get(i));
    }
}

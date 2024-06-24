package lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Задание №1
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на
 * экран.
 */
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(101));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
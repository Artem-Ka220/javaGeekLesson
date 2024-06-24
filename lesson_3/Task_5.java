package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Задание №4
 * Каталог товаров книжного магазина сохранен в виде двумерного
 * списка List<ArrayList<String>> так, что на 0й позиции каждого
 * внутреннего списка содержится название жанра, а на остальных
 * позициях - названия книг. Напишите метод для заполнения данной
 * структуры.
 */
public class Task_5 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> genre = new ArrayList<>(Arrays.asList("genreOne", "bookOne", "bookTwo", "bookThree"));
        ArrayList<String> genreOne = new ArrayList<>(Arrays.asList("genreOne", "bookOne", "bookTwo", "bookThree"));
        ArrayList<String> genreTwo = new ArrayList<>(Arrays.asList("genreOne", "bookOne", "bookTwo", "bookThree"));
        ArrayList<String> genreThree = new ArrayList<>(Arrays.asList("genreOne", "bookOne", "bookTwo", "bookThree"));

        catalog.add(genre);
        catalog.add(genreOne);
        catalog.add(genreTwo);
        catalog.add(genreThree);

        System.out.println(catalog);

        for (ArrayList<String> genreAny : catalog) {
            System.out.println(genreAny);
        }
    }
}
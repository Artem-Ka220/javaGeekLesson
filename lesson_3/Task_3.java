package lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задание №2.1
 * Заполнить список названиями планет Солнечной
 * системы в произвольном порядке с повторениями.
 * Вывести название каждой планеты и количество его
 * повторений в списке.
 * Задание состоит из двух блоков
 * Задание №2.2 (если выполнено первое задание)
 * Пройти по списку из предыдущего задания и удалить
 * повторяющиеся элементы.
 */
public class Task_3 {
    public static void main(String[] args) {
        List<String> aList = planetsList();
        uniquePlanetCount(aList);
        deletPlanets(aList);
        System.out.println(aList);
    }

    public static List<String> planetsList() {
        List<String> listPlanets = new ArrayList<>();
        listPlanets.add("Mars");
        listPlanets.add("Earth");
        listPlanets.add("Jupiter");
        listPlanets.add("Venus");
        listPlanets.add("Neptune");
        listPlanets.add("Saturn");
        listPlanets.add("Mercury");
        listPlanets.add("Earth");
        listPlanets.add("Jupiter");
        listPlanets.add("Venus");
        listPlanets.add("Neptune");
        listPlanets.add("Earth");
        listPlanets.add("Venus");

        return listPlanets;
    }

    public static void uniquePlanetCount(List<String> planets) {
        List<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);

        int count = 1;
        String currentPlanets = sortedPlanets.get(0);

        for (int i = 1; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i).equals(currentPlanets)) {
                count++;
            } else {
                System.out.println(currentPlanets + ": " + count);
                count = 1;
                currentPlanets = sortedPlanets.get(i);
            }
        }
    }

    public static void deletPlanets(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanets = planets.get(i);
            for (int j = i + 1; j < planets.size(); j++) {
                if (planets.get(j).equals(currentPlanets)) {
                    planets.remove(j);
                    j--;
                }
            }
        }
    }
}
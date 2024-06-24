package lesson_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Задание №3
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа
 */
public class Task_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "4", "8", "10"));
        deleteIntInterator(list);
        System.out.println(list);
    }

    public static boolean tryString(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void deleteInt(List<String> listAny) {
        for (int i = 0; i < listAny.size(); i++) {
            if (tryString(listAny.get(i))) {
                listAny.remove(i);
                i--;
            }
        }
    }

    public static void deleteIntInterator(List<String> aList) {
        Iterator<String> itr = aList.iterator();
        while (itr.hasNext()) {
            String elem = itr.next();
            if (tryString(elem)) {
                itr.remove();
            }
        }
    }
}
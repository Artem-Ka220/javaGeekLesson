package lesson_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int element = Methods.getElementFromIntegerCollections(list, 1);
        System.out.println(element);

        Integer newElement = Methods.<Integer>getElementFromUCollection(list, 4);
        System.out.println(newElement);
    }
}

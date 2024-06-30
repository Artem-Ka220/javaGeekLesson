
// Задание №0
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {
        int size = 100000;

        System.out.println("Добавление в конец списка: ");
        System.out.println("ArrayList: ");
        long start = System.currentTimeMillis();
        getArrayListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        System.out.println("Добавление в конец списка: ");
        System.out.println("LinkedList: ");
        start = System.currentTimeMillis();
        getLinkedListLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();
        
        System.out.println("Добавление в начало списка: ");
        System.out.println("ArrayList: ");
        start = System.currentTimeMillis();
        getArrayListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();
        
        System.out.println("Добавление в начало списка: ");
        System.out.println("LinkedList: ");
        start = System.currentTimeMillis();
        getLinkedFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();
        
        System.out.println("Добавление в середину списка: ");
        System.out.println("ArrayList: ");
        start = System.currentTimeMillis();
        getArrayListAdMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();
        
        System.out.println("Добавление в середину списка: ");
        System.out.println("LinkedList: ");
        start = System.currentTimeMillis();
        getLinkedListMiddle(size);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static ArrayList<Integer> getArrayListAddLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }
    public static LinkedList<Integer> getLinkedListLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }
    public static LinkedList<Integer> getLinkedFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }
    public static ArrayList<Integer> getArrayListAdMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size()/2,i);
        }
        return arrayList;
    }
    public static LinkedList<Integer> getLinkedListMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size()/2,i);
        }
        return linkedList;
    }
}
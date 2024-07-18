package lesson_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Programm
 */
public class Programm {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(123);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Worker worker = new Worker("Petr", "Solodilov", 34, 65000);
        Iterator<String> lIt = worker;
        while (lIt.hasNext()) {
            System.out.println(lIt.next());
        }
        List<Worker> workers = new ArrayList<>();
        workers.add(worker);

        Worker worker1 = new Worker("Valu", "Penchikov", 45, 2300);
        Worker worker2 = new Worker("Baunty", "Eldorado", 25, 83000);
        workers.add(worker1);
        workers.add(worker2);

        Iterator<Worker> newIterator = workers.iterator();
        while (newIterator.hasNext()) {
            System.out.println(newIterator.next());
        }
    }
}
// false
// 0
// 0
// false
// 2055281021
// 1554547125
// Worker1 w1 = new Worker1("Имя", "Фамилия", 20, 20);
// Worker1 w2 = new Worker1("Имя", "Фамилия", 20, 20);

// System.out.println(w1 == w2);
// System.out.println(w1.compareTo(w2));
// System.out.println(w2.compareTo(w1));
// System.out.println(w1.equals(w2));
// System.out.println(w1.hashCode());
// System.out.println(w2.hashCode());
// false
// 0
// 0
// false
// 1706377736
// 468121027
// Worker2 w1 = new Worker2("Имя", "Фамилия", 20, 201);
// Worker2 w2 = new Worker2("Имя", "Фамилия", 20, 201);
// System.out.println(w1 == w2);
// System.out.println(w1.compareTo(w2));
// System.out.println(w2.compareTo(w1));
// System.out.println(w1.equals(w2));
// System.out.println(w1.hashCode());
// System.out.println(w2.hashCode());
// Worker3 w1 = new Worker3("Имя", "Фамилия", 20, 201);
// Worker3 w2 = w1;// new Worker3("Имя", "Фамилия", 20, 201);
// System.out.println(w1 == w2);
// System.out.println(w1.equals(w2));
// System.out.println(w1);
// System.out.println(w2);
// w1.age = 31;
// System.out.println(w1);
        // System.out.println(w2);

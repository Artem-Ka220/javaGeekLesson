package lesson_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Program
 */
public class ProgramNY {

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(0, 101));
        }

        System.out.println(list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);

        List<WorkerNY> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new WorkerNY("firstName " + i, "lastName " + i, r.nextInt(18, 65), r.nextInt(80000)));
        }
        //1.Первый способ(логику зашиваем в class worker(прописано несколько вариантов.))
        System.out.println(db);
        //1.Collections.sort(db);
        //2.db.sort(new SalaryComporator());//2.функионал сортировки в SalaryComporator
        db.sort((w1, w2) -> Integer.compare(w1.age, w2.age));//3. способ № 3
        System.out.println();
        System.out.println(db);
    }
}

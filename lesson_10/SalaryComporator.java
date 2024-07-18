package lesson_10;

import java.util.Comparator;

/**
 * SalaryComporator
 */
public class SalaryComporator implements Comparator<WorkerNY> {

    @Override
    public int compare(WorkerNY o1, WorkerNY o2) {
        return Integer.compare(o1.salary, o2.salary);
    }
}

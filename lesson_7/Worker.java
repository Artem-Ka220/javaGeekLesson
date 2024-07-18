package lesson_7;

import java.util.Iterator;

/**
 * Worker
 */
public class Worker implements Iterator<String> {

    public String firstName;
    public String lastName;
    public int age;
    public int salary;
    public int index;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.index = index;
    }

    public String fullName() {
        return String.format("%s, %s", firstName, lastName);
    }

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("First name: %s", firstName);
            case 2:
                return String.format("Last name: %s", lastName);
            case 3:
                return String.format("Age: %d", age);
            default:
                return String.format("Salary: %d", salary);
        }
    }

    @Override
    public String toString() {
        return String.format("FirstName: %s, lastName: %s, age: %d, salary: %d.\n", firstName, lastName, age, salary);
    }
}

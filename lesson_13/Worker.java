package lesson_13;

/**
 * Worker
 */
public class Worker {

    private int id;
    private int age;
    private int salary;
    private String firstName;
    private String lastName;

    public Worker(int id, int age, int salary, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("First name: %s, last name: %s", firstName, lastName);
    }

}

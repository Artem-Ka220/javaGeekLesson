package lesson_13;

/**
 * ParameterizedWorker
 */
public class ParameterizedWorker<U> {

    private U id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public ParameterizedWorker(U id, String firstName, String lastName, int age, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getId() {
        return String.format("id: %s", id);
    }

    public String getFullName() {
        return String.format("Full name: %s %s", firstName, lastName);
    }
}

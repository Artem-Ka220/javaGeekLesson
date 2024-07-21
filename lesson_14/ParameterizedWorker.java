package lesson_14;

/**
 * ParameterizedWorker
 */
public class ParameterizedWorker<U> {

    private U id;
    public String name;
    public String lastName;
    public int age;
    public int salary;

    public ParameterizedWorker(U id, String name, String lastName, int age, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public U getId() {
        return id;
    }

    public void setId(U id) {
        this.id = id;
    }

    public String fullName() {
        return String.format("Full name: %s, %s", name, lastName);
    }
}

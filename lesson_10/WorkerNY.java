package lesson_10;

/**
 * WorkerNY
 */
public class WorkerNY implements Comparable<WorkerNY> {

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public WorkerNY(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String FullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("First name: %s, last name: %s, age: %d, salary: %d\n", firstName, lastName, age, salary);
    }

    @Override
    public int compareTo(WorkerNY o) {
        return Integer.compare(this.salary, o.salary);
        //return Integer.compare(this.age, o.age);
        // if (this.age > o.age) {
        //     return 1;
        // } else if (this.age < o.age) {
        //     return -1;
        // } else {
        //     return 0;
        // }
    }
}

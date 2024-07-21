package lesson_13;

import java.util.UUID;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Worker worker = new Worker(1, 27, 87000, "Peter", "Solovev");
        System.out.println(worker);

        ParameterizedWorker<Integer> parameterizedWorker = new ParameterizedWorker<Integer>(2, "Tatyna", "Petechkina", 24, 54250);
        System.out.println(parameterizedWorker.getId());
        System.out.println(parameterizedWorker.getFullName());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> worker2 = new ParameterizedWorker<String>(uid, "Sasha", "Sobornicova", 28, 85500);
        System.out.println(worker2.getId());

        MultiParameterized<Integer, Double, String> mp = new MultiParameterized<Integer, Double, String>(123, 5.6, "Aslanbek");
        System.out.println(mp);

        MultiParameterized<String, String, String> mp1 = new MultiParameterized<String, String, String>("Perevodchik", "Bustrou", "Copernik");
        System.out.println(mp1);
    }
}

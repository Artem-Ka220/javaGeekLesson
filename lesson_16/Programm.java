package lesson_16;

/**
 * Programm
 */
public class Programm {
    public static void main(String[] args) {
        PresenterOfT pot = new PresenterOfT<SumModel>(new View(), new SumModel());
        pot.Button();
    }
}
package lesson_11;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        MyCoffee latte = new MyCoffee();
        latte.addComponent(new MyIngredient("вода"));
        latte.addComponent(new MyIngredient("водаAqua"));
        latte.addComponent(new MyIngredient("вода"));

        for (MyIngredient ingredient : latte) {
            System.out.println(ingredient);
        }
    }
}

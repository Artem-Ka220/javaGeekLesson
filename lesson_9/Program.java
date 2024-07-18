package lesson_9;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        CoffeeNew coffeeNew = new CoffeeNew();
        coffeeNew.addComponent(new WaterNew("Вода."));
        coffeeNew.addComponent(new WaterNew("Вода."));
        coffeeNew.addComponent(new WaterNew("Вода."));

        for (IngredientNew ingredientNew : coffeeNew) {
            System.out.println(ingredientNew);
        }
    }
}

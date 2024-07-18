package lesson_8;

import java.util.Iterator;

/**
 * ProgramMy
 */
public class ProgramMy {

    public static void main(String[] args) {
        BeverageMy newBeverageMy = new CoffeeMy();
        newBeverageMy.addComponent(new WaterMy("Вода."));
        newBeverageMy.addComponent(new MilkMy("Молоко."));
        newBeverageMy.addComponent(new BeansMy("Зёрна."));

        Iterator<IngredientMy> iterator = newBeverageMy;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}

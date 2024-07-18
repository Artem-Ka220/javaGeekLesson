package lesson_9;

import java.util.Iterator;

/**
 * CoffeeNew
 */
public class CoffeeNew extends BeverageNew {

    @Override
    public Iterator<IngredientNew> iterator() {
        Iterator<IngredientNew> it = new Iterator<IngredientNew>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public IngredientNew next() {
                return components.get(index++);
            }

        };
        return it;
    }
}

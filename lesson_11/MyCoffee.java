package lesson_11;

import java.util.Iterator;

/**
 * MyCoffee
 */
public class MyCoffee extends MyBeverage {

    @Override
    public Iterator<MyIngredient> iterator() {
        Iterator<MyIngredient> it = new Iterator<MyIngredient>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public MyIngredient next() {
                return list.get(index++);
            }
        };
        return it;
    }
}

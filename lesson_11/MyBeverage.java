package lesson_11;

import java.util.ArrayList;
import java.util.List;

/**
 * MyBeverage
 */
public abstract class MyBeverage implements Iterable<MyIngredient> {

    public List<MyIngredient> list;
    int index;

    public MyBeverage() {
        list = new ArrayList<>();
        index = 0;
    }

    public void addComponent(MyIngredient component) {
        if (!(list.indexOf(component) != -1)) {
            list.add(component);
        }
    }
}

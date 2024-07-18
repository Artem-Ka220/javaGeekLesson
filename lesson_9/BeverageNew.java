package lesson_9;

import java.util.ArrayList;
import java.util.List;

/**
 * BeverageNew
 */
public abstract class BeverageNew implements Iterable<IngredientNew> {

    public List<IngredientNew> components;
    int index;

    public BeverageNew() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(IngredientNew component) {
        components.add(component);
    }
}

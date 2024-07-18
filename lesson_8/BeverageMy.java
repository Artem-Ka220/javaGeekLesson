package lesson_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * BeverageMy
 */
public class BeverageMy implements Iterator<IngredientMy> {

    List<IngredientMy> components;
    int index;

    public BeverageMy() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(IngredientMy component) {
        components.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public IngredientMy next() {
        return components.get(index++);
    }
}

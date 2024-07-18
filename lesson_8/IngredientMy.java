package lesson_8;

/**
 * IngredientMy
 */
public abstract class IngredientMy {

    public String brand;

    public IngredientMy(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

}

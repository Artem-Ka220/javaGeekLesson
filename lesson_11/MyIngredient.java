package lesson_11;

/**
 * MyIngredient
 */
public class MyIngredient {

    public String brand;

    public MyIngredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }

    @Override
    public boolean equals(Object obj) {
        MyIngredient myIngredient = (MyIngredient) obj;
        return myIngredient.brand == this.brand;
    }

}

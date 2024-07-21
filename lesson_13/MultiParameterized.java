package lesson_13;

/**
 * MultiParameterized
 */
public class MultiParameterized<U1, U2, U3> {

    public U1 value;
    public U2 value1;
    public U3 value2;

    public MultiParameterized(U1 u1, U2 u2, U3 u3) {
        this.value = u1;
        this.value1 = u2;
        this.value2 = u3;
    }

    @Override
    public String toString() {
        return String.format("U1 type: %s, U2 type: %s, U3 type %s", value.getClass().getSimpleName(), value1.getClass().getSimpleName(), value2.getClass().getSimpleName());
    }

}

package lesson_14;

import java.util.List;

/**
 * Methods
 */
public class Methods {

    public static Integer getElementFromIntegerCollections(List<Integer> col, int index) {
        return col.get(index);
    }

    public static String getElementFromStringCollections(List<String> col, int index) {
        return col.get(index);
    }

    public static Double getElementFromDoubleCollections(List<Double> list, int index) {
        return list.get(index);
    }

    public static <S> S getElementFromUCollection(List<S> list, int index) {
        return list.get(index);
    }
}

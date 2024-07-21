package lesson_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            list.add(String.format("string %d", i));
        }

        System.out.println(list);
        // list.add(123);The method add(int, String) in the type List<String> is not applicable for the arguments (int)Java(67108979)

        List listTwList = new ArrayList<>();
        // List is a raw type. References to generic type List<E> should be parameterized

        for (int i = 0; i < 5; i++) {
            listTwList.add(String.format("String", i));
        }
        listTwList.add(123);
        System.out.println(listTwList);
        // class java.lang.Integer cannot be cast to class java.lang.String
        // ava:27: warning: [unchecked] unchecked call to add(E) as a member of the raw type List
        // listTwList.add(123);
        //  where E is a type-variable:E extends Object declared in interface List
        System.out.println(allLength(listTwList));

    }

    static int allLength(List ls) {
        int count = 0;
        for (Object object : ls) {
            count += ((String) object).length();
        }
        return count;
    }
}

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true
package lesson_5;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Isomorphic
 */
public class Isomorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stOne = sc.nextLine();
        String stTwo = sc.nextLine();
        System.out.println(isIsomrphic(stOne, stTwo));
        sc.close();
    }

    public static boolean isIsomrphic(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }
        if (strOne.equals(strTwo)) {
            return true;
        }
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < strOne.length(); i++) {
            char c1 = strOne.charAt(i);
            char c2 = strTwo.charAt(i);
            if (hashMap.containsKey(c1) && c2 != hashMap.get(c1)) {
                return false;
            } else {
                hashMap.put(c1, c2);
            }
        }
        return true;
    }
}

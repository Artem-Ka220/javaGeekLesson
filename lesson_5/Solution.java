// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
// 'I', 1
// 'V', 5
// 'L', 50
// 'C', 100
// 'D', 500
// 'M', 1000
package lesson_5;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        String romNum = "MMXXIV";
        System.out.println(romanToArabic(romNum));
    }

    public static Map<Character, Integer> romanArabicNum() {
        Map<Character, Integer> rMap = new HashMap<>();
        rMap.put('I', 1);
        rMap.put('V', 5);
        rMap.put('X', 10);
        rMap.put('L', 50);
        rMap.put('C', 100);
        rMap.put('D', 500);
        rMap.put('M', 1000);
        return rMap;
    }

    public static int romanToArabic(String romanNum) {
        Map<Character, Integer> romanMap = romanArabicNum();
        int result = 0;
        int prevValue = 0;
        for (int i = romanNum.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(romanNum.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}

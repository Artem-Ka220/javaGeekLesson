// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
package lesson_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ArrangingBrackets {

    public static void main(String[] args) {
        String[] strings = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}"};

        for (String string : strings) {
            boolean isCorrect = isBracketsCorrect(string);
            System.out.println(string + " -> " + isCorrect);
        }
    }

    public static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> bMap = new HashMap<>();
        bMap.put(')', '(');
        bMap.put(']', '[');
        bMap.put('}', '{');
        bMap.put('>', '<');
        return bMap;
    }

    public static boolean isBracketsCorrect(String expression) {
        Map<Character, Character> brackets = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        for (Character character : expression.toCharArray()) {
            if (brackets.containsValue(character)) {
                stack.push(character);
            } else if (brackets.containsKey(character)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(character)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

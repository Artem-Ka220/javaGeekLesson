// Задание №2
// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
package lesson_2;

/**
 * Task_2
 */
public class Task_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(str);
        compressString(str);
    }

    static void compressString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char step = string.charAt(0);
        stringBuilder.append(step);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) != step) {
                stringBuilder.append(string.charAt(i));
            }
            step = string.charAt(i);
        }
        System.out.println(stringBuilder);
    }
}

// решение с урока:
// public class Task02 {
// public static void main(String[] args) {
// String str = "aaaabbbcdd";
// String newStr = compressString(str);
// System.out.println(newStr);
// }

// public static String compressString(String str){
// int count = 1;
// StringBuilder res = new StringBuilder();
// char currentChar = str.charAt(0);

// for (int i = 1; i < str.length(); i++) {
// if(str.charAt(i) == currentChar){
// count++;
// } else {
// res.append(currentChar).append(count);
// currentChar = str.charAt(i);
// count = 1;
// }
// }
// res.append(currentChar).append(count);
// return res.toString();
// }

// }
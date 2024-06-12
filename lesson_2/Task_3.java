// Задание №3
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).
package lesson_2;

public class Task_3 {
    public static void main(String[] args) {
        String string = "saippuakivikauppias";
        System.out.println(string);
        System.out.println(palindrome(string));
    }

    static boolean palindrome(String anyString) {
        boolean bool = false;
        String newString = "";
        for (int i = anyString.length() - 1; i >= 0; i--) {
            newString = newString + anyString.charAt(i);
        }
        System.out.println(newString);
        if (newString.equals(anyString)) {
            bool = true;
        }
        return bool;
    }
}

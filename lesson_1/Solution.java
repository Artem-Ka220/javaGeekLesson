// Задание №1
// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”
package lesson_1;

import java.util.Scanner;

/**
 * Solution
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "ibm866");
        System.out.println("Введите имя: ");

        String yourName = scanner.nextLine();
        System.out.printf("Привет, %s", yourName);
        scanner.close();
    }
}
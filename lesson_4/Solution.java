// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Введите текс для сохранения в памяти.");
            System.out.println("Введите \"print\" для вывода списка введенного в обратном порядке.");
            System.out.println("Введите \"revert\" для удаления последнего введённого текста.");
            System.out.println("Введите \"q\" для завершения.");

            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            if (input.equals("print")) {
                if (list.isEmpty()) {
                    System.out.println("Список пуст!");
                } else {
                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.print(list.get(i) + "");
                    }
                }
            } else if (input.equals("revert")) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(input);
                System.out.println(list);
            }
        }
        scanner.close();
    }
}

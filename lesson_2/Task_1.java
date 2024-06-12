// Задание №1
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
package lesson_2;

public class Task_1 {
    public static void main(String[] args) {
        int n = 8;
        String c1 = "s";
        String c2 = "y";
        System.out.println(wordString(n, c1, c2));
        System.out.println(wordStringTwo(n, 'h', 'g'));
    }

    static String wordString(int anyNum, String anySymbol, String anySYmbolTwo) {
        String newString = anySymbol;
        while (anyNum != 1) {
            if (anyNum % 2 == 0) {
                newString = newString + anySYmbolTwo;
            } else {
                newString = newString + anySymbol;
            }
            anyNum--;
        }
        return newString;
    }

    static StringBuilder wordStringTwo(int anyNum, char anySymbol, char anySymbolTwo) {
        StringBuilder newString = new StringBuilder();
        int count = 0;
        while (count < anyNum) {
            if (count % 2 == 0) {
                newString.append(anySymbol);
            } else {
                newString.append(anySymbolTwo);
            }
            count++;
        }
        return newString;
    }
}

// Решение от преподователя:
// public class AlternatingChars {
// public static void main(String[] args) {
// int n = 500_000;
// char c1 = 'A';
// char c2 = 'B';
// // ABABABAB
// long start = System.currentTimeMillis();
// alternatingCharsStr(n, c1, c2);
// System.out.println(System.currentTimeMillis() - start);

// start = System.currentTimeMillis();
// alternatingCharsSb(n, c1, c2);
// System.out.println(System.currentTimeMillis() - start);

// }

// public static String alternatingCharsStr(int n, char c1, char c2) {
// String str = "";
// for (int i = 0; i < n / 2; i++) {
// str = str + c1 + c2;
// }
// return str;
// }

// public static String alternatingCharsSb(int n, char c1, char c2) {

// StringBuilder sb = new StringBuilder(n);

// for (int i = 0; i < n / 2; i++) {
// sb.append(c1).append(c2);
// }
// return sb.toString();
// }
// }
// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
package lesson_2;

import java.io.FileWriter;
import java.io.IOException;

public class Task_4 {
    public static void main(String[] args) {
        String string = oneHundredString(100);
        writeTest(string);
    }

    static String oneHundredString(int anyNum) {
        String str = "";
        for (int i = 0; i <= anyNum; i++) {
            str = str + i + " " + "TEST" + "\n";
        }
        return str;
    }

    static void writeTest(String string) {
        try (FileWriter fileWriter = new FileWriter("fileWriterTestText.txt", true)) {
            fileWriter.write(string);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Системе не удается найти указанный путь!");
        }
    }
}

// решение с урока
// public class Task04 {
// public static void main(String[] args) {
// String str = "TEST";
// int n = 100;
// String newStr = stringMaker(str, n);
// String fileName = "text.txt";
// writeToFile(newStr, fileName);
// }

// public static String stringMaker(String str, int n) {
// StringBuilder sb = new StringBuilder();
// for (int i = 0; i < n; i++) {
// sb.append(str).append(" ");
// }
// return sb.toString();
// }

// public static void writeToFile(String str, String fileName) {
// try (FileWriter fw = new FileWriter(fileName, true)){
// fw.write(str);
// fw.write(System.lineSeparator());
// System.out.println("Success");
// } catch (Exception e){
// System.err.println("Error. File is not written.");
// }
// }
// }
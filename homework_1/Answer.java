// Вычислить n-ое треугольного число(сумма чисел от 1 до n).

// Внутри класса Answer напишите метод countNTriangle, который принимает число n
// и возвращает его n-ое треугольное число.
// Если число n < 1 (ненатуральное) метод должен вернуть -1.
package homework_1;

/**
 * Answer
 */
public class Answer {
    public static void main(String[] args) {
        System.out.println(countNTriangle(-2));
    }

    static int countNTriangle(int n) {
        int sum = 0;
        if (n < 1) {
            return -1;
        } else {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
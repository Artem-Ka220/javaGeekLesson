package homework_4;

// В классе MyQueueInt реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
import java.util.LinkedList;

// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
public class PrinterTwo {

    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());
        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}

class MyQueue<T> {

    LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T element) {
        linkedList.add(element);
    }

    public T dequeue() {
        return linkedList.pop();

    }

    public T first() {
        return linkedList.peek();
    }

    public LinkedList<T> getElements() {
        return linkedList;
    }
}

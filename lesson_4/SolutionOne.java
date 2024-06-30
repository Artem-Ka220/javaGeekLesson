// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди. 

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SolutionOne {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printStack(array);
        System.out.println();
        printQueue(array);
    }

    public static void printStack(int[] anyArray) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < anyArray.length; i++) {
            stack.push(anyArray[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void printQueue(int[] anyArray) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < anyArray.length; i++) {
            queue.add(anyArray[i]);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}

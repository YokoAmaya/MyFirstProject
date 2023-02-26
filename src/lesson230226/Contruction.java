package lesson230226;

import java.util.ArrayDeque;
import java.util.Deque;

/* Используем суперкласс как набор каких-то заготовок
 * */
public class Contruction {
    static class myStack extends ArrayDeque {
        @Override
        public void push(Object o) {
            addLast(o);
        }

        @Override
        public Object pop() {
            return removeLast();
        }
    }

    public static void main(String[] args) {
        Deque degue = new myStack();

        process(degue);
    }

    private static void process(Deque deque) {
        //Нарушили принцип подстановки
        deque.push("one");
        deque.push("two");
        deque.push("three");
        // three two one ??? one two three

        System.out.println(deque.removeFirst());

    }
}

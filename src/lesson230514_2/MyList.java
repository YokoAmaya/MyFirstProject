package lesson230514_2;

import java.util.Iterator;

//итераторы
public class MyList<T> implements Iterable<T>{


    private class Node {
        T data;
        Node next;
    }
    Node first;
    Node current;

    public void add(T data) {
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
    }

    @Override
    public String toString() {
        String s = "[";
        Node tmp = first;
        while (tmp != null) {
            s += tmp.data;
            s += " ";
            tmp = tmp.next;
        }
        s += "]";
        return s;
    }

    @Override
    public Iterator<T> iterator() {
        current = first;
        return new Iterator<T>() {
            Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }

        };
    }
}

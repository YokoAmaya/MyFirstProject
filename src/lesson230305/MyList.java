package lesson230305;

public class MyList<T> {
    Node<T> first;

    public void add(T data) {
        Node<T> node = new Node<T>();
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
}

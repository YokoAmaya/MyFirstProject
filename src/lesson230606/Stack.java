package lesson230606;

public class Stack<T> {
    T[] data;
    private int next;

    public Stack (int maxSize) throws IllegalAccessException {
        if(maxSize <= 0)
        {
            throw new IllegalAccessException();
        }
        data = (T[]) new Object[maxSize];

    }
    public void push(T item) throws StackOverflowException{
        if (next == data.length) {
            throw new StackOverflowException("Overflow max size:  " +data.length);
        }
        data[next++] = item;

    }

    public T pop() throws  StackUnderflowException{
        if(next == 0){
            throw new StackUnderflowException();
        }
        T tmp = data[--next];
        data[next] = null;
        return tmp;
    }
}

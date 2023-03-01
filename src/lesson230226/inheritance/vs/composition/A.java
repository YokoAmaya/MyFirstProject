package lesson230226.inheritance.vs.composition;

public class A {
    int state;

    public A(int initialState) {
        state = initialState;
    }

    public A() {
        this(10);
    }

    public void change() {
        state++;
        System.out.println("A");
    }
}

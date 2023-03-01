package lesson230226.inheritance.vs.composition;

public class E extends A implements Changeable {

    public E(int initState) {
        super(initState);
    }

    @Override
    public void change() {
        state = (int) Math.pow(state, 2);
        System.out.println("E");
    }
}

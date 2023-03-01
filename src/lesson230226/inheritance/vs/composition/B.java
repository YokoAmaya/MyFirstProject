package lesson230226.inheritance.vs.composition;

public class B extends A {
    @Override
    public void change() {
        super.change();
        state *= 2;
        System.out.println("B");
    }
}

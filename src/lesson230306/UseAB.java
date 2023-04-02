package lesson230306;

public class UseAB {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.S s = new A.S();
    }
}

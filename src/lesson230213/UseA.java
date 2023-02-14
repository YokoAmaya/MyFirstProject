package lesson230213;

public class UseA {


    public static void main(String[] args) {
        A.staticMethod();
        A a = new A();
        A.staticMethod(a);


        A a2 = new A(90);

        A.printCount();


    }
}

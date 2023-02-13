package lesson230213;

public class A {

    private static final int NONE = -1;
    private static int GlobalCount;
    private int x; //полная инкапсуляция


    public A(int x) {
        this.x = x;
        GlobalCount += 1;
    }

    public A() {
        this(NONE);
    }


    public static void staticMethod() {
        System.out.println("static");
        //this.x = 10; ERROR!
    }

    public static void staticMethod(A a) {
        a.x = 10;
    }

    public static void printCount() {
        System.out.println("Count = " + GlobalCount);
    }
}

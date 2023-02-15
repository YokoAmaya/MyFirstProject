package lesson230215;

public class InharitanceMethods {
    static class A {
        int calc() {
            return 2 * 2;
        }

    }

    static class B extends A {
        @Override
        int calc() {
            return 10 + super.calc(); //обращение к суперклассу (родителю)
        }

        int calcSuper() {//обращаться к методам суперкласса можно откуда угодно
            return super.calc();
        }
    }

    static class C extends B {
        @Override
        int calc() {//обратились к методу у дедушки
            return super.calcSuper();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.calc());

        B b = new B();
        System.out.println(b.calc());
    }
}

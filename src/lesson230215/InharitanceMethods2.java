package lesson230215;

public class InharitanceMethods2 {

    static class A {
        int calc() {
            return 2 * 2;
        }

    }

    static class B extends A {

    }

    static class C extends B {

        @Override
        int calc() {//смогли обратиться так как ближайший класс предок с таким методом дедушка
            return super.calc();
        }
    }

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.calc());
        /* Вывелась 4 потому что при создании экземпляра класса С
         * мы обратились к ближайшей существующей функции тоесть к
         * функции дедушки */
    }
}

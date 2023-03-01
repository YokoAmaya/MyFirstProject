package lesson230226.inheritance.vs.composition;

public class Composition {
    static class A {
        void doIt() {
            System.out.println(this.getClass().getSimpleName() + " is working");
        }
    }

    static class B extends A {

    }

    static class C {
        A a = new A();

        void doIt() {
            a.doIt();
        }
    }

    static class D {
        A a;

        D(A a) {
            this.a = a;
        }

        void doIt() {
            a.doIt();
        }
    }

    static class E {
        A a;

        void setA(A a) {
            this.a = a;
        }

        void doIt() {
            a.doIt();
        }
    }

    static class F {
        void doIt(A a) {
            a.doIt();
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.doIt();
        B b = new B();
        b.doIt(); //Жёсткий вариант, невозможно в процессе выполнения программы что-то уже изменить
        C c = new C();
        c.doIt(); //Относительно гибкий вариант, но проблема заключается в том что A было проинициализированно в классе и изменить его ни как уже нельзя
        D d = new D(a);
        d.doIt(); //Немного расширили вариант с C потому что сделали инициализацию во время объявления класса
        E e = new E();
        e.setA(b);//Чуть ли не наиболее гибкая конструкция, так как мы отдельно оказываем кто будет работать отдельным методом,
        e.doIt(); //если нам нужен другой исполнитель, мы его можем легко установить и дальше продолжить пользоваться кодом.
        F f = new F();
        f.doIt(a);//Самый гибкий вариант так как мы сразу делегируем действие нужному нам объекту.
    }
}

package lesson230213;

public class B {

    public static int x = 1;

    static {
        System.out.println("now x = " + x);
        x = 2;
        System.out.println("then x = " + x);
    }

    /*
        Статический блок инициализации вызывается при первом обращении к классу
        В том числе при вызове его статических методов
        При просто упоминании блок инициализации НЕ срабатывает
        Блоков может быть несколько
     */
    static {
        System.out.println("Static");
    }
    /*
        Блок инициализации всегда выполняется первым не зависимо от того где находиться
        Блоков может быть несколько и выполняются они все по очереди
        Сначала Satic потом обычные
    */

    {
        System.out.println("Instance");
    }

    public B() {
        System.out.println("Constructor");
    }

}

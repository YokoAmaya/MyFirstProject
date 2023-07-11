package exception;

// StackOverflowException in Java

//Основная причина появления переполнения стека - неправильные рекурсивные функции
//Ошибка времени выполнения

// Importing all classes of
// java.util package
import java.util.*;

// Class
public class GFG3 {

    // Method1()
    public static void methodOne()
    {
        // Defining Method2() in Method1()
        methodTwo();
    }

    // Method2()
    public static void methodTwo()
    {
        // Calling method1 in methos2()
        methodOne();
    }

    // Main driver method
    public static void main(String[] args)
    {

        // Calling method1() in main()
        methodOne();
    }
}

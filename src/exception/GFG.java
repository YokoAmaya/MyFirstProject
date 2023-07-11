package exception;

//Пример IllegalArgumentException
//Проверяемое исключение - во время компиляции
//Относиться к общим программным исключениям
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a new thread
        Thread t = new Thread();

        // valid in thread
        t.setPriority(10);

        // invalid(IllegalArgumentException(IAE))
        t.setPriority(100);
        //Могут быть значения только от 1 до 10
    }
}
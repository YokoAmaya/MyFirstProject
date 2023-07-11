package exception;

// NumberFormatException in Java
//Вызывыется когда пытаемся преобразрваться не то что надо

// Importing input output java classes
import java.io.*;

// Class
public class GFG4 {

    // Main driver method
    public static void main(String[] args)
    {
        // ParseInt() takes integer value as parameter
        // other values

        // valid
        int i = Integer.parseInt("50");

        // invalid
        // forInputString(A)
        // NumberFormatException will be thrown
        int j = Integer.parseInt("A");

        // invalid
        // forInputString(five)
        // NumberFormatException will be thrown
        int k = Integer.parseInt("five");
    }
}

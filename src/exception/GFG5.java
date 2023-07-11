package exception;

// NullPointerException in Java

//Возникает когда
// Importing all classes of
// java.util package
import java.util.*;

// Class
public class GFG5 {

    // Main driver method
    public static void main(String[] args)
    {
        // Assigning null to string
        String str = null;

        // Calculating length of string

        // Forcefully printing length which throws
        // NullPointerException
        System.out.println(str.length());
    }
}


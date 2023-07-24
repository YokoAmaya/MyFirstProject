package lesson230724;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class IOStreams{
    static class A implements Serializable{
        @Serial
        private static final long serialVersionUID = 1L;
        String x = "Hello";
    }
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] byteArray = new byte[0];

        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            A a = new A();
            oos.writeObject(a);
            byteArray = baos.toByteArray();

            System.out.println(Arrays.toString(byteArray));

            for (byte b:byteArray) {
                char c = (char) b;
                System.out.print (c);
            }
            System.out.println();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);

        try {
            ObjectInputStream ois = new ObjectInputStream(bais);
            A a = (A) ois.readObject();
            System.out.println(a.x);
        } catch (IOException  | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

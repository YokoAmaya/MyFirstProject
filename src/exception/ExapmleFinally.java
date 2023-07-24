package exception;

import lesson230606.StackOverflowException;

public class ExapmleFinally {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            try {
                String data = null;
                System.out.println(data.length());
            } catch (NullPointerException e) {
                System.out.println(e);
                throw new ArithmeticException();
                //break;
            } finally {
                System.out.println("finally block" + i);
                //break;
            }
            //System.out.println("code next try/catch" + i);
        }
    }
}

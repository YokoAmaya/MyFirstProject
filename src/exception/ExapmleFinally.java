package exception;

public class ExapmleFinally {
    public static void main(String[] args) {
        try{
            String data = null;
            System.out.println(data.length());
        } catch (NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("code next try/catch");
    }
}

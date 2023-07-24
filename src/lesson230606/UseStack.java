package lesson230606;

public class UseStack {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Start");
        Stack<String> stack = new Stack<String>(2);

        try {
            String s = stack.pop();
            System.out.println(s);
        } catch (StackUnderflowException e) {
            //e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }

        try {
            stack.push("one");
            stack.push("two");
            stack.push("three");
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }finally {

        }
        System.out.println("End");

    }
}

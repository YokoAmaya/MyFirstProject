import ClassOnTest.*;

public class TestClassObject {
    public static void main(String[] args) {
        ObjectTest test = new ObjectTest();

        System.out.println("test.getClass() " + test.getClass());

        System.out.println("test.hashCode() " + test.hashCode());

        System.out.println("test.equals(test) " + test.equals(test));

        //ObjectTest test2 = test.clone();

        System.out.println("test.toString() " + test.toString());
        //test.wait(5000);
        System.out.println("End Wait");

    }
}

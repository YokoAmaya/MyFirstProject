package lesson080223;

public class PassByValue {

    public static void main(String[] args) {
        int x = 10;

        process(x);
        System.out.print(x);
    }

    static void process(final int x) {
        //x = 20; Error
    }
}

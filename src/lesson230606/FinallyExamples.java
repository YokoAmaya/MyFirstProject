package lesson230606;

public class FinallyExamples {

    public static void main(String[] args) {

        System.out.println(getAge());
        try{
            System.out.println("Рилл работает?");
            throw new RuntimeException("стоп");
        } finally {
            System.out.println("И тут тоже?");
        }


    }

    private static int getAge() {
        try{
            return 20;
        }finally {
            return 30;
        }
    }
}

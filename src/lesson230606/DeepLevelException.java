package lesson230606;

public class DeepLevelException {
    public static void main(String[] args) {
        boss();

    }

    private static void boss() {
        try {
            zam();
        } catch (Exception e) {
            System.out.println("Фиксить бааааг!!!");
        }
    }

    private static void zam() throws Exception {
        try {
            helper();
        } catch (Exception e) {
            if(e.getMessage().equals("haha"))
            {
                System.out.println("прекратить шуточки!");
                return;
            }
            throw e;
        }
    }

    private static void helper() throws Exception {
        inter();
    }

    private static void inter() throws Exception {
        tmp();
    }

    private static void tmp() throws Exception {
        //boss();
        throw new Exception("haha");
    }
}

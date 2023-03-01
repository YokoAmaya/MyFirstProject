import java.util.ArrayList;

public abstract class Main {

    private String name = "challenger";

    public static void main(String[] args) {
        Main abstractClassMutation = new AbstractClassImpl();
        abstractClassMutation.name = "mutated challenger";
        System.out.println(abstractClassMutation.name);
    }

}

class AbstractClassImpl extends Main {
}


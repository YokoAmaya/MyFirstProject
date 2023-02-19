package lesson230216;

public class Raven extends Pet implements Chirikable {

    @Override
    public void chirik() {
        System.out.println("Kaaaarrr");
    }

    @Override
    public void special() {
        chirik();
    }
}

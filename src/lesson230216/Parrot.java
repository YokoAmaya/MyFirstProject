package lesson230216;

public class Parrot extends Pet implements Chirikable {
    @Override
    public void chirik() {
        System.out.println("Сам дуууурааак!)");
    }

    @Override
    public void special() {
        chirik();
    }
}

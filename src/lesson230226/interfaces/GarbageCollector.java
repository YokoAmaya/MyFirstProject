package lesson230226.interfaces;

public class GarbageCollector {

    public static void main(String[] args) {
        Car car = new Car();
        Table table = new Table();
        Crachable[] things = {car, table};

        collect(things);
    }

    private static void collect(Crachable[] things) {
        for (Crachable crachable : things) {
            crachable.crash();
        }
    }
}

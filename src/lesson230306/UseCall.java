package lesson230306;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class UseCall {


    public static void main(String[] args) {
        List<Call> calls = new LinkedList<>();
        calls.add(Call.register("Moscow", 10, 30));
        calls.add(Call.register("Moscow", 19, 30));
        calls.add(Call.register("Samara", 1, 20));
        calls.add(Call.register("Samara", 11, 20));
        calls.add(Call.register("New-York", 2, 0));
        calls.add(Call.register("Minsk", 9, 10));
        calls.add(Call.register("Minsk", 23, 10));
        calls.add(Call.register("Vladivostok", 16, 40));

        //Устойчивые сортировки
        Collections.sort(calls);
        System.out.println(calls);
        Collections.sort(calls, Call.CITY_COMPARATOR);
        System.out.println(calls);
    }
}

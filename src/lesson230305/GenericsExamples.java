package lesson230305;

import java.util.*;

public class GenericsExamples {

    public static void main(String[] args) {
        // List = interface  LinkedList = class
        List list = new LinkedList();

        list.add(10);
        list.add("Hello");

        //List<String> listOfStrings = new LinkedList<>(); // необязательно писать 2 раз угловые скобки
        //Объявление с помощью класса коллекции, позволяет нам полностью избежать возможного попадания других элементов
        // в список, кроме тех что мы задали. Происходит ошибка компиляции
        //Минут в том что это замедляет работу так как каждый раз когда мы добавляем элемент происходит проверка
        List<String> listOfStrings = Collections.checkedList(new LinkedList<String>(), String.class);
        listOfStrings.add("Hello");

        //listOfStrings.add(10); //ERROR!!!

        //Это приводит к ошибке если используется коллекция
        List t = listOfStrings;
        // t.add(10); RunTimeException

        //Когда создаём список через asList нам гарантировано, что это список нельзя в дальнейшем изменить
        List<String> menu = Arrays.asList("Steak", "Fri", "Chiken");
        //List<String> menu2 = Arrays.asList(10, 20, 30); ERROR!
        //List<Integer> menu2 = Arrays.asList(10, 20, 30); OK

        List<String> menu3 = new ArrayList<>();
        menu3.add("One");
        menu3.add("Two");
        menu3.add("Three");

        menu3 = Collections.unmodifiableList(menu3);

        print(menu3);// Exception

        System.out.println(menu3);
    }

    private static void print(List<String> menu) {
        menu.add("Potato");
    }
}

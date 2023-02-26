package lesson230226;

/* принцип подстановки Liskov
Функции, которые используют базовый тип, должны иметь возможность
использовать подтипы базового типа, не зная об этом.
* */
public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {

        Object o = new String("Hello!");
        System.out.println(o.toString());//для строки возвращает значение строки
        System.out.println(o.hashCode());

        o = new Object();

        System.out.println(o.toString());//для объекта возвращает значение самого объекта + его хэш в 16-ричном виде
        System.out.println(o.hashCode());
    }
}

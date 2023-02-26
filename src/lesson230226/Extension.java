package lesson230226;
/*Дополняет поведение класса
не нарушается принцип подстановки
самый распространённый вид наследования
* */

public class Extension {

    static class Dog {

    }

    static class HuntDog extends Dog {
        //Дополнительное действие для охотничьей собаки
        public void trackFox() {
            System.out.println("tracking fox");
        }
    }
}

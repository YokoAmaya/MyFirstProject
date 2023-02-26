package lesson230226;
/* В суперклассе описываются действия, но не описывается как эти действия
должны выполняться
* */

public class Specification {
    static abstract class Pet {
        abstract void wash();
    }

    static class Dog extends Pet {

        @Override
        void wash() {
            System.out.println("washing dog");
        }
    }
}

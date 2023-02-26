package lesson230226;

/*Специализация - случай наследования когда подкласс является
частным случаем суперкласса.
Соблюдаеться принцип подстановки
*/
public class Specialization {
    static class Pet {
        public void feed() {
            System.out.println("feeding pet");
        }

    }

    //просто уточнение класса Cat
    static class Cat extends Pet {
        @Override
        public void feed() {
            super.feed();
            murr();
        }

        public void combBehindEar() {
            murr();
        }

        private void murr() {
            System.out.println("Muuurr");
        }
    }

}

package lesson230216;

public class Pet {

    public void feed() {
        System.out.println("Pet is not hungry now");
    }

    public void walk() {
        System.out.println("You walked with your pet");
    }

    public void play() {
        System.out.println("Played with pet");
    }

    void care() {
        feed();
        walk();
        play();
        /* проверяем является ли класс потомком MammalPetWithFur
           Если да, то делаем приведение класса и обращаемся к нужному нам методу
        */
        //Перенесли этот if в абстрактный класс
//        if (this instanceof MammalPetWithFur) {
//            // явное приведение типа
//            // Нисходящее - когда мы по иерархии классов движемся вниз
//            MammalPetWithFur furry = (MammalPetWithFur) this;
//            furry.comb();
//        }

        special();
        //заменили на новую функцию special
//        if (this instanceof Chirikable) {
//            Chirikable chirikPet = (Chirikable) this;
//            chirikPet.chirik();
//        }

    }

    public void special() {

    }

}

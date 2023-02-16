package lesson230216;

public class PetCare {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Turtle turtle = new Turtle();
        Parrot parrot = new Parrot();

        care(cat);
        System.out.println(cat.toString());
        //care(dog);
        //care(turtle);

    }

    private static void care(Pet pet) {
        pet.feed();
        pet.walk();
        pet.play();
        /* проверяем является ли класс потомком MammalPetWithFur
           Если да, то делаем приведение класса и обращаемся к нужному нам методу
        */
        if (pet instanceof MammalPetWithFur) {
            ((MammalPetWithFur) pet).comb();
        }


    }


}

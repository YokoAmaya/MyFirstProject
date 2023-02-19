package lesson230216;

public class PetCare {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Turtle turtle = new Turtle();
        Parrot parrot = new Parrot();
        Raven raven = new Raven();


        //Обманываем компилятор
        //Pet pettucchi = parrot; //неявное приведение типа
        // (восходящее в стучае когда мы по иерархии идём в верх)
        //((MammalPetWithFur) pettucchi).comb();

        //Заменили на функцию с нефиксированным числом параметров
        //cat.care();
        //parrot.care();
        //raven.care();
        care(cat, dog, turtle, parrot, raven);

        //care(dog);
        //care(turtle);

    }

    public static void care(Pet... pets) {
        for (Pet pet : pets) {//позволяет пройти по всему массиву параметров
            pet.care();
        }

    }


}

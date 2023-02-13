public class Panda {
    Panda(String n){name=n;}
    // поля
    String name = "Лилу"; // имя
    int age = 5; // возраст
    int weight = 120; // вес в килограммах

    // есть бамбук
    void eatBamboo(int foodWeight) {
        weight = weight + foodWeight; // если покормить Лилу, она прибавит в весе
    }

    // падать
    void fall() {
        System.out.println("Шмяк");
    }

    // играть
    void play() {
        weight = weight - 5; // Лилу сбрасывает вес, когда играет
        System.out.println("Смотри, как я могу!");
    }
}

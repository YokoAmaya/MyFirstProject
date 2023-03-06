package lesson230305;

import java.util.Random;

//Cloneable - интерфейс метка. Внутри него нет ни каких методов

public class Monster implements Cloneable {

    private static Random random = new Random();

    private static class Dragon extends Monster {

    }

    private static class GiantBear extends Monster {

    }

    private static class Goblin extends Monster {

    }

    static private Monster[] monsters = {new Dragon(), new GiantBear(), new Goblin()};

    //creatMonster является дизайн-паттерной (Фабричный метод), так как он для нас создаёт новый экземпляр класса
    static public Monster creatMonster() {
        int monsterIndex = random.nextInt(monsters.length);
        Monster randomMon = monsters[monsterIndex];
        Monster concreateMonster = null;
        try {
            concreateMonster = (Monster) randomMon.clone();
            return concreateMonster;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);

        }

    }
}

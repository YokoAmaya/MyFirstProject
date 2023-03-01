package progTime230301;

//Создать класс
public class Panda {
    //имя вес

    private String name = "Sofia";

    private double weight = 100;

    public Panda(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    private void eat(int boomb) {
        this.weight += 0.5 * boomb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


    public static void main(String[] args) {
        Panda panda = new Panda("Sofia", 100);
        panda.eat(10);
        panda.setName("Qwerty");
        System.out.println(panda.getName() + " " + panda.getWeight());
    }

}

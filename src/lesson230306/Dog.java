package lesson230306;

public class Dog {
    //Делегирование и композиция
    //Можно рассматривать как некую реализацию паттерны State
    interface BrainState {
        void feed();
        void stroke();
    }
    class GoodMood implements BrainState{
        private static final int MAX_STROKES = 3;
        int count;
        @Override
        public void feed() {
            Dog.this.eat();
            Dog.this.wag();
        }

        @Override
        public void stroke() {
            count++;
            if (count >= MAX_STROKES){
                Dog.this.brainState = Dog.this.new BadMood();
            }
            Dog.this.wag();
            Dog.this.bark();
        }
    }
    class BadMood implements BrainState{

        @Override
        public void feed() {
            Dog.this.eat();
            Dog.this.brainState = Dog.this.new GoodMood();
        }

        @Override
        public void stroke() {
            Dog.this.bite();
        }

    }
    BrainState brainState = Dog.this.new BadMood();

    public void feed(){
        System.out.println("--> Feed dog");
        brainState.feed();//делегирование
    }
    public void stroke(){
        System.out.println("--> Stroke dog");
        brainState.stroke();//делегирование
    }

    private void bite() {
        System.out.println("bites");
    }

    private void bark() {
        System.out.println("backs");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void wag() {
        System.out.println("wags");
    }
}

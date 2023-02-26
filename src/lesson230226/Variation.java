package lesson230226;

public class Variation {

    static class HuntDog {
        public void trackFox() {

        }
    }

    static class HuntDucksDog extends HuntDog {
        public void thackDuck() {
            //something
            trackFox();
        }
    }
}

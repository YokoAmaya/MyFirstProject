package lesson230226.inheritance.vs.composition;

public class UseAB {
    public static void main(String[] args) {
        B b = new B();
        b.change();
        System.out.println(b.state);
        C c = new C();
        // ch.setChanger(D.changer);
        c.setChanger(new D(50));
        c.change();
        c.setChanger(new E(350));
        c.change();
        //System.out.println(b.state);
    }
}

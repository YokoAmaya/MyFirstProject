package lesson230306;

public class Inners {
    static class A{

        int x = 0;
        class B{
            {
                x = 10; // A.this.x
            }
        }
    }

    static class C {
        int x = 0;
        public void change(){
            x += 20; // A.this.x
        }
    }
    static class D{
        private C c;

        public D(C c ){
            this.c = c;
        }
        public void change(){
            c.x += 20;
        }
    }
}

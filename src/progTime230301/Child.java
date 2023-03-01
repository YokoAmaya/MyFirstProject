package progTime230301;

public class Child implements Footballer, Pupil {
    @Override
    public void footballMethod1() {
        System.out.println("footballMethod1");
    }

    @Override
    public void footballMethod2() {
        System.out.println("footballMethod2");
    }

    @Override
    public void pupilMethod() {
        System.out.println("pupilMethod1");
    }

    @Override
    public void pupilMethod2() {
        System.out.println("pupilMethod2");

    }

    //@Override
    public void pupilMethod3() {

    }
}

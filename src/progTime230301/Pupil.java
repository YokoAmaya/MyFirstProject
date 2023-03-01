package progTime230301;

public interface Pupil {
    void pupilMethod();

    void pupilMethod2();

    default void pupilMethod3() {
        System.out.println("pupilMethod3");
    }
}

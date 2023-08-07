package lesson230807;

public class Threads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        new Thread(){
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                System.out.println(currentThread);
                System.out.println(currentThread.getStackTrace());
                for (StackTraceElement el : currentThread.getStackTrace()){
                    System.out.println(el.getClassName() + " : " + el.getMethodName() + " : " + el.getLineNumber());
                }
            }
        }.start();
    }
}

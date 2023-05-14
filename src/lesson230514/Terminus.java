package lesson230514;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

@Simple
public class Terminus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start typing");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            process(line);
        }

        System.out.println("Finish typing");
    }

    private static void process(String line) {
        for (Method method : Terminus.class.getMethods())
        {
            if (method.isAnnotationPresent(Command.class)) {
                String anno = method.getAnnotation(Command.class).value();
                if(line.toUpperCase().equals(anno)){
                    try {
                        method.invoke(null,null);
                        return;
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        System.out.println("unknown command");
//        Class<?> clazz = Terminus.class;
//        for (Annotation annotation: clazz.getAnnotations()){
//            System.out.println(annotation);
//        }
//        switch (line){
//            case "left":
//                left();
//                break;
//            case "right":
//                right();
//                break;
//            case "sit":
//                sit();
//                break;
//            case "stand":
//                stand();
//                break;
//            default:
//                System.out.println("unknown command");
//                break;
//        }
    }
    @Command("LEFT")
    public static void left() {
        System.out.println("moving left");
    }
    @Command("RIGHT")
    public static void right () {
        System.out.println("moving right");
    }
    @Command("SIT")
    public static void sit() {
        System.out.println("sat");
    }
    @Command("STAND")
    public static void stand() {
        System.out.println("stood");
    }

}

package lesson230514;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//сохранить во время работы программы
@Target(ElementType.METHOD)
public @interface Command {
    String value();

}

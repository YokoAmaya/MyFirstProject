package lesson230226;

import java.awt.*;

/* Расширяем суперкласс.
Нарушается принцип подстановки и этого надо избегать!!!
Выход из такой ситуации сделать наследование в другую сторону.
* */
public class Generalization {
    static class Window { //monochrome

    }

    static class ColoredWindow extends Window {
        Color color;
    }
}

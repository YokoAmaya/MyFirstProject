package lesson230226;

import java.util.ArrayDeque;

/*Берём какой-то функционал родителя и какие-то функции запрещаем.
Нарушается принцип подстановки

НЕЛЬЗЯ! Понижать уровень видимости функции! Поэтому используем исключения
Но можно повышать уровень видимости protect -> public
* */

public class Restriction {
    static class MyStack extends ArrayDeque {
        @Override
        public void push(Object o) {
            addLast(o);
        }

        @Override
        public Object pop() {
            return removeLast();
        }

        @Override
        public void addFirst(Object o) {
            //Запретили пользоваться методом
            throw new UnsupportedOperationException();
        }

        @Override
        public Object removeFirst() {
            //Запретили пользоваться методом
            throw new UnsupportedOperationException();
        }
    }
}

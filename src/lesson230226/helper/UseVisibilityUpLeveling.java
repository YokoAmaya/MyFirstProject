package lesson230226.helper;

import lesson230226.VisibilityUpLeveling;

public class UseVisibilityUpLeveling {
    public static void main(String[] args) {
        VisibilityUpLeveling.A a = new VisibilityUpLeveling.A();
        //a.method(); Нельзя вызвать потому что уровень доступа только в пакете
        VisibilityUpLeveling.B b = new VisibilityUpLeveling.B();
        b.method(); //Добрались до метода из суперкласса
    }
}

package lesson230208;

import java.util.Date;

public class PassLink {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.print(date.getDate());
        process(date);
        System.out.print(date.getDate());
    }

    static void process(Date x) {
        x.setDate(12);
    }
}

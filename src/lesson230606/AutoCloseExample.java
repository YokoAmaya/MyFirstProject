package lesson230606;

import java.util.Scanner;
//ctrl+D остановка цикла while при сканере
public class AutoCloseExample {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}

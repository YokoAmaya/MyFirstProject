package lesson230724;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class YaRuGetter {
    public static void main(String[] args) {
        try(Socket socket = new Socket("ya.ru", 80)) {
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream); // Обёртка которая сама за нас по байтно отправит наш запрос
            pw.println("GET / HTTP/1.1");
            pw.println();
            pw.flush();
            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

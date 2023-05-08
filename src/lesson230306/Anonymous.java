package lesson230306;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// анонимные классы
public class Anonymous {

    static class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("you clicked me!)");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));

        frame.add(panel);

        JButton button = new JButton("Click me");
        panel.add(button);

        frame.pack();
        button.addActionListener(new MyActionListener());

        //Пример создания анонимного класса - на основе интерфейса
//        panel.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println(e);
//            }
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println(e);
//            }
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                System.out.println(e);
//            }
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                System.out.println(e);
//            }
//            @Override
//            public void mouseExited(MouseEvent e) {
//                System.out.println(e);
//            }
//        });
        //Создание анонимного класса на основе наследования
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e);
            }
        });
    }
}

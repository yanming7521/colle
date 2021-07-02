package gui;
import javax.swing.*;
import java.awt.*;
public class Win {
    public static void main(String[] args) {
        JFrame w1 = new JFrame("窗口1");
        Container con = w1.getContentPane();
        con.setBackground(Color.black);
        w1.setBounds(60,100,500,400);
        w1.setVisible(true);
        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame w2 = new JFrame("窗口2");
        w2.setBounds(560,100,500,400);
        w2.setVisible(true);
        w2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Menu m1 = new Menu("窗口程序",450,530,300,190);
    }
}

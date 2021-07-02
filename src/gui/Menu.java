package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import static javax.swing.JFrame.*;

public class Menu extends JFrame {
    JMenuBar bar;
    JMenu menu,sub;
    JMenuItem it1,it2;
    public Menu() {}
    public Menu(String s,int x,int y,int w,int h){
        init(s);
        setLocation(x,y);
        setSize(w,h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    void init (String s){
        setTitle(s);
        bar = new JMenuBar();
        menu = new JMenu("菜单");
        sub = new JMenu("子菜单");
        it1 = new JMenuItem("Java");
        it2 = new JMenuItem("C++");
        it1.setAccelerator(KeyStroke.getKeyStroke('A'));
        it2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        menu.add(it1);
        menu.addSeparator();
        menu.add(it2);
        menu.add(sub);
        sub.add(new JMenuItem("数据结构"));
        sub.add(new JMenuItem("算法分析"));
        bar.add(menu);
        setJMenuBar(bar);
    }
}

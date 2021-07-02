package gui;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Winjs extends JFrame{
    JTextField in1,in2;
    JComboBox cherfu;
    JButton button;
    JTextArea show;
    OperatorListener oper;
    CompListener comp;
    public Winjs(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        setLayout(new FlowLayout());
        in1 = new JTextField(5);
        in2 = new JTextField(5);
        cherfu = new JComboBox();
        button = new JButton("计算");
        cherfu.addItem("选择运算");
        String []a = {"+","-","*","/"};
        for(int i = 0; i < a.length; i++){
            cherfu.addItem(a[i]);
        }
        show = new JTextArea(10,24);
        oper = new OperatorListener();
        comp = new CompListener();
        oper.setJComboBox(cherfu);
        oper.setWork(comp);
        comp.setIn1(in1);
        comp.setIn2(in2);
        comp.setShow(show);
        cherfu.addItemListener(oper);
        button.addActionListener(comp);
        add(in1);
        add(cherfu);
        add(in2);
        add(button);
        add(new JScrollPane(show));
    }
}

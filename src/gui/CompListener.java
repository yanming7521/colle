package gui;

import javax.swing.*;
import java.awt.event.*;

public class CompListener implements ActionListener {
    JTextField in1,in2;
    JTextArea show;
    String fuhao;
    public void setFuhao (String s) {
        fuhao = s;
        System.out.println("确定符号");
    }
    public void setIn2(JTextField in2) {
        this.in2 = in2;
    }
    public void setShow(JTextArea show) {
        this.show = show;
    }
    public void setIn1(JTextField in1) {
        this.in1 = in1;
    }
    public void actionPerformed (ActionEvent e) {
        try {
            double num1 = Double.parseDouble(in1.getText());
            double num2 = Double.parseDouble(in2.getText());
            double ret = 0;
            if (fuhao.equals("+")) {
                ret = num1 + num2;
            }
            if (fuhao.equals("-")) {
                ret = num1 - num2;
            }
            if (fuhao.equals("*")) {
                ret = num1 * num2;
            }
            if (fuhao.equals("/")) {
                ret = num1 / num2;
            }
            show.append(num1 + " " + fuhao + " " + num2 + " = " + ret + "\n");
        }
        catch (Exception exp) {
            show.append("请输入数字字符\n");
        }
        System.out.println("计算");
    }
}

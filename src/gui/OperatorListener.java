package gui;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OperatorListener implements ItemListener {
    JComboBox choice;
    CompListener work;
    public void setJComboBox (JComboBox box){
        choice = box;
    }
    public void setWork(CompListener work1){
        work = work1;
    }
    public void itemStateChanged (ItemEvent e){
        String fh = choice.getSelectedItem().toString();
        work.setFuhao(fh);
    }
}

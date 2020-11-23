package Lab.Lab_9_1.Counter;

import javax.swing.*;
import java.awt.event.*;

public class ExitButton extends JButton implements ActionListener{
    private Counter model;
    private CounterFrame view;

    public ExitButton(String label, Counter m, CounterFrame v){
        super(label);
        model = m;
        view = v;
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        model.exit();
    }
}

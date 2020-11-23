package Lab.Lab_9_1.Counter;

import javax.swing.*;
import java.awt.*;

public class CounterFrame extends JFrame {
    private Counter count;
    private JLabel label = new JLabel("count = 0");
    private JPanel drawing;

    public CounterFrame(Counter c, JPanel panel){
        count = c;
        drawing = panel;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());
        JPanel p3 = new JPanel(new FlowLayout());

        p1.add(label);
        p2.add(new CountButton("COUNT", count, this));
        p3.add(new ExitButton("EXIT", count, this));

        cp.add(p1, BorderLayout.NORTH);
        cp.add(drawing, BorderLayout.CENTER);
        cp.add(p2, BorderLayout.WEST);
        cp.add(p3, BorderLayout.EAST);

        setTitle("Counter");
        setSize(380,300);
        setVisible(true);
    }

    public void update(){
        label.setText("count = " + count.countOf());
        drawing.repaint();
    }
}

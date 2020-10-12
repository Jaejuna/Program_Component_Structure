package HW;

import javax.swing.*;
import java.awt.*;

public class HW_3 extends JPanel {
    private int width;
    private int height;
    private int x_position;
    private int y_position;

    public HW_3(int w, int h) {
        width = w;
        height = h;
        x_position = width / 5;
        y_position = height / 2;
        JFrame my_frame = new JFrame();
        my_frame.setTitle("Drawing Flowers");
        my_frame.setSize(width, height);
        my_frame.setVisible(true);
        my_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void drawFlower(Graphics g, int x, int y, int r, Color c1, Color c2) {
        g.setColor(Color.black);
        g.fillOval(x_position, y_position, width, height);
        x_position = x;
        y_position = y;
    }

    public void drawPetal(Graphics g, int x, int y, int r, int angle, Color color) {
        g.setColor(Color.BLACK);
        g.fillArc(50, 50, width * 2, height * 2, 0, 30);
        x_position = x;
        y_position = y;
    }

}

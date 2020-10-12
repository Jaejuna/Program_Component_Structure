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
        my_frame.getContentPane().add(this);
        my_frame.setTitle("Drawing Flowers");
        my_frame.setSize(width, height);
        my_frame.setVisible(true);
        my_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g){
        drawPetal(g,x_position,y_position,10,0,Color.lightGray);
        drawFlower(g,x_position,y_position,10, Color.black, Color.gray);
    }

    public void drawPetal(Graphics pen, int x, int y, int r, int angle, Color color) {
        pen.setColor(Color.lightGray);
        pen.fillRect(0,0, width, height);
        pen.setColor(Color.black);

        pen.fillArc(x_position -30, y_position-30, width /7, (height +200) /7, 0, 30);
        pen.fillArc(x_position -30, y_position-30, width /7, (height +200) /7, 70, 30);
        pen.fillArc(x_position -30, y_position-30, width /7, (height +200) /7, 140, 30);
        pen.fillArc(x_position -30, y_position-30, width /7, (height +200) /7, 210, 30);
        pen.fillArc(x_position -30, y_position-30, width /7, (height +200) /7, 280, 30);

        pen.setColor(Color.yellow);
        pen.fillArc(x_position +170, y_position-90, width /6, (height +200) /6, 0, 30);
        pen.fillArc(x_position +170, y_position-90, width /6, (height +200) /6, 70, 30);
        pen.fillArc(x_position +170, y_position-90, width /6, (height +200) /6, 140, 30);
        pen.fillArc(x_position +170, y_position-90, width /6, (height +200) /6, 210, 30);
        pen.fillArc(x_position +170, y_position-90, width /6, (height +200) /6, 280, 30);

        pen.setColor(Color.green);
        pen.fillArc(x_position -30, y_position-340, width /5, (height +200) /5, 0, 30);
        pen.fillArc(x_position -30, y_position-340, width /5, (height +200) /5, 70, 30);
        pen.fillArc(x_position -30, y_position-340, width /5, (height +200) /5, 140, 30);
        pen.fillArc(x_position -30, y_position-340, width /5, (height +200) /5, 210, 30);
        pen.fillArc(x_position -30, y_position-340, width /5, (height +200) /5, 280, 30);

        pen.setColor(Color.magenta);
        pen.fillArc(x_position +450, y_position, width /3, (height +200) /3, 0, 30);
        pen.fillArc(x_position +450, y_position, width /3, (height +200) /3, 70, 30);
        pen.fillArc(x_position +450, y_position, width /3, (height +200) /3, 140, 30);
        pen.fillArc(x_position +450, y_position, width /3, (height +200) /3, 210, 30);
        pen.fillArc(x_position +450, y_position, width /3, (height +200) /3, 280, 30);


        x_position = x;
        y_position = y;
    }

    public void drawFlower(Graphics pen, int x, int y, int r, Color c1, Color c2) {
        pen.setColor(Color.blue);
        pen.fillOval(x_position, y_position, width /13, (height+200)/13);

        pen.setColor(Color.red);
        pen.fillOval(x_position +205, y_position -50, width /11, (height+200)/11);

        pen.setColor(Color.black);
        pen.fillOval(x_position+10, y_position - 300, width /9, (height+200)/9);

        pen.setColor(Color.pink);
        pen.fillOval(x_position+ 515, y_position + 70, width /5, (height+200)/5);

        x_position = x;
        y_position = y;
    }

}

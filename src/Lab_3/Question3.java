package Lab_3;

import java.awt.*;
import javax.swing.*;

public class Question3 extends JPanel {

    private int SIZE = 100;
    private int X = 3;
    private int Y = 2;
    private int WIDTH = X * SIZE;
    private int HEIGHT = Y * SIZE;
    private int width = WIDTH;
    private int height = HEIGHT;
    private int x = 0;
    private int y = 0;

    public Question3() {
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Egg");
        f.setSize(WIDTH, HEIGHT+22);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.yellow);
        g.fillOval(x, y, width, height);
        x = x + X * 5;
        y = y + Y * 5;
        width = width - X * 10;
        height = height - Y * 10;
    }

    public static void main(String[] args) {
        new Question3();
    }
}

package Lab.Lab_5;

import java.awt.*;
import javax.swing.*;

public class BankWriter extends JPanel {
    private int WIDTH = 300;
    private int HEIGHT = 200;
    private BankAccount bank;
    private String last_transaction = "";


    public BankWriter(String title, BankAccount b) {
        bank = b;
        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle(title);
        f.setSize(WIDTH, HEIGHT);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT + 22);
        g.setColor(Color.BLACK);
        int text_margin = 50;
        int text_baseline= 50;
        g.drawString(last_transaction, text_margin, text_baseline);
        g.drawString("잔액 = " + bank.getBalance() + "원", text_margin, text_baseline + 20);
    }

    public void showTransaction(int amount, String message){
        last_transaction = amount + "원" + message;
        this.repaint();
    }

    public void showTransaction(String message) {
        last_transaction = message;
        this.repaint();
    }
}

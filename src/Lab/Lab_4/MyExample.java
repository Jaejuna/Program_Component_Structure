package Lab.Lab_4;
import javax.swing.*;

public class MyExample {

    public static void main(String[] args) {
        int width = 300;
        int height = 200;
        MyWriter writer = new MyWriter(width, height);
        writer.positionSentence(80,80);
        String s = JOptionPane.showInputDialog("보고 싶은 문장 넣어주세요.");
        writer.writeSentence(s);
    }
}
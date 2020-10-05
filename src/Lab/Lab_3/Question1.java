package Lab.Lab_3;

import javax.swing.*;
import java.text.DecimalFormat;

public class Question1 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("화씨 온도를 입력하세요.");
        double f = Double.parseDouble(input);
        double c = (f - 32) * 5.0 / 9.0;
        String message = "화씨 온도는" + new DecimalFormat("0.00").format(c) + "도";
        JOptionPane.showMessageDialog(null, c);
    }
}

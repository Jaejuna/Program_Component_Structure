package Lab.Lab_5;

import javax.swing.*;

public class BankReader {

    private String input_line;

    public BankReader(){
        input_line = "";
    }

    public char readCommand(String message){
    input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
    return input_line.charAt(0);
    }

    public int readAmount(){
        int amount = 0;
        String s = input_line.substring(1, input_line.length());
        s = s.trim();
        if (s.length()>0)
            amount = Integer.parseInt(s);
        else
            JOptionPane.showMessageDialog(null, "금액 입력 오류");
        return amount;
    }
}

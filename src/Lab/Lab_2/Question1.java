package Lab.Lab_2;
import java.text.DecimalFormat;

public class Question1 {
    public static void main(String[] args) {

        double m = Double.parseDouble(args[0]);
        double k = m * 1.60934;
        DecimalFormat formatter = new DecimalFormat("0.0");

        System.out.println(formatter.format(m) + " 마일은 " +
                formatter.format(k) + " 킬로미터 입니다.");
    }
}
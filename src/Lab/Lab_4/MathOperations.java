package Lab.Lab_4;

import java.text.*;

public class MathOperations {

    public double inverse(int i){
        double d = 1.0 / i;
        return d;
    }

    public void printInverse(int i){
        DecimalFormat formatter = new DecimalFormat("0.000");
        double d = 1.0 / i;
        String s = formatter.format(d);
        System.out.println(s);
    }

    public void printInverse(int i, String pattern){
        DecimalFormat formatter = new DecimalFormat(pattern);
        double d = 1.0 / i;
        String s = formatter.format(d);
        System.out.println(s);
    }

    public void printInverse(int i, DecimalFormat formatter){
        double d = 1.0 / i;
        String s = formatter.format(d);
        System.out.println(s);
    }
}

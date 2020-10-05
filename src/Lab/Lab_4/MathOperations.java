package Lab.Lab_4;

import java.text.*;

public class MathOperations {

    //변수 i의 역수를 리턴 해주는 메소드
    public double inverse(int i){
        double d = 1.0 / i;
        return d;
    }

    //변수 i의 역수를 표준 실생창에 프린트 해주는 메소드
    public void printInverse(int i){
        DecimalFormat formatter = new DecimalFormat("0.000");
        double d = 1.0 / i;
        String s = formatter.format(d);
        System.out.println(s);
    }

    //변수 i의 역수를 pattern 문자열이 제시한 모맷으로 표준 실행창에 프린트 해주는 메소드
    public void printInverse(int i, String pattern){
        DecimalFormat formatter = new DecimalFormat(pattern);
        double d = 1.0 / i;
        String s = formatter.format(d);
        System.out.println(s);
    }

    //변수 i의 역수를 DecimalFormat 객체가 제시한 포맷으로 표준 실행창에 프린트트
    public void printInverse(int i, DecimalFormat formatter){
        double d = 1.0 / i;
        String s = formatter.format(d);
        System.out.println(s);
    }
}

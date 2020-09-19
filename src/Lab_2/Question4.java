package Lab_2;

public class Question4 {
    public static void main(String[] args) {
        double total;
        int p = Integer.parseInt(args[0]);          //투자 원금
        double i = Double.parseDouble(args[1]);     //목표 수익금
        int n = Integer.parseInt(args[2]);          //달 수

        total = p * Math.pow((1+i),n);

        System.out.println("투자 원금 = " + p + "원");
        System.out.println("월 수익률 = " + i + "%");
        System.out.println(n + "개월 후 총액 = " + total + "원");
    }
}

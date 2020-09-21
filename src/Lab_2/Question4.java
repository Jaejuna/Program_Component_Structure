package Lab_2;

public class Question4 {
    public static void main(String[] args) {
        int principal = Integer.parseInt(args[0]);          //투자 원금
        double interest = Double.parseDouble(args[1]);      //목표 수익금
        int month = Integer.parseInt(args[2]);              //달 수

        System.out.println("투자 원금 = " + principal + "원");
        System.out.println("월 수익률 = " + interest + "%");

        int total = (int)(principal * Math.pow((1 + interest/100), month));

        System.out.println(month + "개월 후 총액 = " + total + "원");
    }
}

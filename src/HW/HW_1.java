package HW;

public class HW_1 {
    public static void main(String[] args) {
        int principal = Integer.parseInt(args[0]);              //투자 원금
        int year = Integer.parseInt(args[1]);                   //년 수
        double yearInterest = Double.parseDouble(args[2]);      //연 이자율

        int realPrincipal = principal * 1000000;                //투자 원금 변환
        int month = year * 12;                                  //년 수 -> 월 수
        double monthInterest = yearInterest / 12;               //연 이자율 -> 월 이자율

        int monthlyPay = (int) ((Math.pow((1 + monthInterest/100), month) * realPrincipal * monthInterest/100) / (Math.pow((1 + monthInterest/100), month) - 1));
        int total = monthlyPay * month;

        System.out.println("자유은행 대출 상환금 계산 서비스에 오심을 환영합니다.");
        System.out.println("손님의 대출원금은 " + principal +"백만원 입니다.");
        System.out.println("연이자율 " + yearInterest + "%로 " + year + "년 동안");
        System.out.println("매월 원리금 균등으로 " + monthlyPay + "원씩 상환하셔야 합니다.");
        System.out.println("총 상환금액은 "+ total + "원 입니다.");

        // 월 대출 상환금과 총 대출액 계산 프로그램
    }
}

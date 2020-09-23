package Lab_2;

public class Question3 {
    public static void main(String[] args) {
        int c = Integer.parseInt(args[0]);
        int sum = 0;

        System.out.println("정수 = " + c );

        c = Math.abs(c);

        int d1 = c%10;
        int d10 = c%100/10;
        int d100 = c%1000/100;
        int d1000 = c%10000/1000;
        int d10000 = c%100000/10000;

        sum = (d1 + d10 + d100 + d1000 + d10000);

        System.out.println("숫자의 합 = " + sum);
        System.out.println("9로 나누어지나? " + (sum % 9 == 0));
    }
}
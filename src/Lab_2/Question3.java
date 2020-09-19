package Lab_2;

public class Question3 {
    public static void main(String[] args) {
        int c = Integer.parseInt(args[0]);
        int result = 1;
        int sum = 0;

        Math.abs(c);

        while (c > 0){
            sum += c%10;
        }

        System.out.println("정수 = " + c );

        if (result <  c % 9){
            System.out.println("9로 나누어지나? " + false);
        }
        else if(result < sum % 9 ){
            System.out.println("9로 나누어지나? " + true);
        }
        else {
            System.out.println("9로 나누어지나? " + true);
        }
    }
}

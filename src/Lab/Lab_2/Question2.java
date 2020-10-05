package Lab.Lab_2;

public class Question2 {
    public static void main(String[] args) {

        int c = Integer.parseInt(args[0]);
        System.out.println("정수 = " + c );
        System.out.println("9로 나누어지나?" + (c % 9==0));
    }
}

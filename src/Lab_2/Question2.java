package Lab_2;

public class Question2 {
    public static void main(String[] args) {

        int c = Integer.parseInt(args[0]);
        System.out.println("정수 = " + c );
        int result = 1;

        if (result <  c % 9){
            System.out.println("9로 나누어지나? " + false);
        }
        else {
            System.out.println("9로 나누어지나? " + true);
        }
    }
}

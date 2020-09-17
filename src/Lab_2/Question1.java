package Lab_2;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        double k;
        double m;

        Scanner scanner = new Scanner(System.in);
        m = scanner.nextDouble();
        k = m * 1.60934;
        System.out.println(m + "마일은" + k + "킬로미터 입니다.");
    }
}

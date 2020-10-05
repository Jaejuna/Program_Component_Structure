package Lab.Lab_1;
import java.time.*;

//오늘, 오늘로 부터 100일 전 & 오늘로 부터 100일 후

public class Question1 {
    public static void main(String[] args) {
        LocalDate Today = LocalDate.now();

        //오늘로 부터 100일 전
        System.out.println("100 days ago: " + Today.minusDays(100));

        //오늘
        System.out.println("Today: " + Today);

        //오늘로 부터 100일 후
        System.out.println("100 days later: " + Today.plusDays(100));
    }
}

//Put .toString() if you need to convert the int method to string method

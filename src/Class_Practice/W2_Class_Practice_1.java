package Class_Practice;

import java.util.*;
import java.time.*;

public class W2_Class_Practice_1 {
    public static void main(String[] args) {
        GregorianCalendar Calendar = new GregorianCalendar();   // GregorianCalendar 클래스를 Calendar변수에 선언
        System.out.println("The current time is " + Calendar.getTime());
        System.out.println("have a good time");

        LocalDateTime Date = LocalDateTime.now();           //LocalDateTime 클래스 안에 있는 now 메소드를 Date변수에 선언
        System.out.println("The current time is " + Date);
        System.out.println("Have a good time");
    }
}
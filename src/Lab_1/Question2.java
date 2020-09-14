package Lab_1;

import java.time.*;

//Calculate the remaining days until Christmas
public class Question2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate x_mas = LocalDate.of(2020,12,25);
        Period P = Period.between(today, x_mas);
        System.out.println(P.getMonths() + " Months " + P.getDays() + " Days to Christmas!");
    }
}

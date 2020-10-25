package Class_Practice;

public class W3_Class_Practice_2 {
    public static void main(String[] args) {
        //Given 3.46 dollars, calculate the no of coins
        int dollars = 3;
        int cents = 46;
        int money = (dollars * 100) + cents;

        System.out.println("Quarters = " + money /25);
        money = money % 25;
        System.out.println("Dimes = " + money / 10);
        money = money % 10;
        System.out.println("Nickels = " + money / 5);
        money = money % 5;
        System.out.println("Dimes = " + money);
    }
}

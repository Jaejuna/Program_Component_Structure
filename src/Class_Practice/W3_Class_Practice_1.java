package Class_Practice;

//Counting coins
public class W3_Class_Practice_1 {
    public static void main(String[] args) {
        int no_of_quarters = 9;
        int no_of_dimes = 2;
        int no_of_nickels = 0;
        int no_of_pennies = 6;

        System.out.println(no_of_quarters + " quarters");
        System.out.println(no_of_dimes + " dimes");
        System.out.println(no_of_nickels + " nickels");
        System.out.println(no_of_pennies + " pennies");
        int total = no_of_quarters * 25 + no_of_dimes * 10 + no_of_nickels * 5 + no_of_pennies * 1;
        System.out.println("The total is: $" + total / 100 + "." + total % 100);
    }
}

import java.util.Scanner;


public class CostCalculator {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        double itemPrice;
        //double SHIPPING_COST = 2.99;
        double TAX_RATE = 0.05;
        double finalPrice;

        System.out.println("Please enter the price of your purchase");
        itemPrice = scan.nextDouble();

        //calculations
        finalPrice = itemPrice + itemPrice * TAX_RATE + /*SHIPPING_COST*/ + ".";

        System.out.println("Your final price is " + finalPrice + ".");

    }
}
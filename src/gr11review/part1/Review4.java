package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;
/**
 * This program Review4.java asks the user for the number of
 * items and their prices then 
 * outputs the subtotal, tax, and total 
 * values of the purchase.
 * @author N. Garcia-Arias
 */
public class Review4{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //Create variables
        int numItems;
        double sumPrice = 0;
        double totalTax;
        double totalPurchase;

        //Set the decimal format to include two decimal places
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        //Ask user for # of items they want to purchase
        System.out.print("How many items do you want to buy? ");
        numItems = Integer.parseInt(key.readLine());

        //Get prices
        for(int i = 1 ;i <= numItems;i++){
            System.out.print("Enter the price for item "+ i+ ": ");
            sumPrice += Double.parseDouble(key.readLine());
        }

        //Calculate tax and total
        totalTax = sumPrice*0.13;
        totalPurchase = sumPrice + totalTax;

        //Output formatted subtotal, tax, and grand total values
        System.out.println("Subtotal: $"+ decimalFormat.format(sumPrice));
        System.out.println("Tax: $"+ decimalFormat.format(totalTax));
        System.out.println("Total: $"+ decimalFormat.format(totalPurchase));
    }
}

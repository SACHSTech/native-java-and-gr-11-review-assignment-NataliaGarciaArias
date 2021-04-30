package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat.*;
/**
 * Block comment here
 * @author N. Garcia-Arias
 */
public class Review4{
    public static void main(String[] args) throws IOException{

        //Create variables
        int numItems;
        double sumPrice = 0;

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //Ask user for # of items they want to purchase
        System.out.print("How many times do you want to buy? ");
        numItems = Integer.parseInt(key.readLine());

        //Get prices
        for(int i = 1 ;i <= numItems;i++){
            System.out.print("Enter the price for item "+ i+ ": ");
            sumPrice += Double.parseDouble(key.readLine());
        }



        //Print total, tax, and grand total
    }
}
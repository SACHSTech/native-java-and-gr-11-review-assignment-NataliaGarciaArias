package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;
/**
 * This program Review6.java allows the user to input
 * item prices until the value '0' is entered, then outputs
 * subtotal, tax, and total values. 
 * @author N. Garcia-Arias
 */
 public class Review6{
     public static void main(String[] args) throws IOException{
         BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

         //Creates variables
         double itemPrice = 1;
         double sumPrice = 0;
         double totalTax;
         double totalPrice;

         //Set the decimal format to include two decimal places
         DecimalFormat decimalFormat = new DecimalFormat("#0.00");

         //Asks user for the price of an item until 0 is entered
         while (itemPrice != 0){
             System.out.print("Enter the price for an item: ");
             itemPrice = Double.parseDouble(key.readLine());

             //Calculates subtotal
             sumPrice += itemPrice;
         }

         //Calculate tax and total
         totalTax = sumPrice * 0.13;
         totalPrice = sumPrice * 1.13;

         //Output subtotal, tax, and total
         System.out.println("Subtotal: $"+ decimalFormat.format(sumPrice));
         System.out.println("Tax: $"+ decimalFormat.format(totalTax));
         System.out.println("Total: $" + decimalFormat.format(totalPrice));

     }
 }
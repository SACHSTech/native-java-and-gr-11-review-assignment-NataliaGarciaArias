package gr11review.part1;
import java.io.*;
/**
 * Block comment
 * @author N. Garcia-Arias
 * 
 */
 public class Review6{
     public static void main(String[] args) throws IOException{
         BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

         //Creates variables
         double itemPrice = 1;
         double sumPrice = 0;
         int itemCount = 1;

         while (itemPrice != 0){
             System.out.print("Enter the price item " +itemCount+ ": ");
             sumPrice += Double.parseDouble(key.readLine());

         }

     }
 }
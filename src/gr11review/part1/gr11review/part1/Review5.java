package gr11review.part1;
import java.io.*;
/**
 * Block comment
 * @author N.Garcia-Arias
 */
public class Review5{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //Create variables
        double investedAmount;
        double interestRate;
        double targetAmount;


        //Prompt for user input
        System.out.print("Enter the yearly invested amount: ");
        investedAmount = Double.parseDouble(key.readLine());

        System.out.print("Enter the compound interest rate: ");
        interestRate = Double.parseDouble(key.readLine());

        System.out.print("Enter the target amount: ");
        targetAmount = Double.parseDouble(key.readLine());



        //Calculate


        //Print results
    }

}

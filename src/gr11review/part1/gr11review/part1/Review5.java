package gr11review.part1;
import java.io.*;
/**
 * This program calculates the years required to
 * reach a target investment amount using inputted information.
 * @author N. Garcia-Arias
 */
public class Review5{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        //Creates variables for user input
        double investedAmount = 0;
        double interestRate = 0;
        double targetAmount = 0;

        //Creates variables for calculations
        double currentAmount = 0;
        double compoundedAmount = 0;
        int targetTime = 0;

        //Asks user for the yearly invested amount, interest rate, and target amount
        System.out.print("Enter the yearly invested amount: ");
        investedAmount = Double.parseDouble(key.readLine());

        System.out.print("Enter the compound interest rate: ");
        interestRate = Double.parseDouble(key.readLine());

        System.out.print("Enter the target amount: ");
        targetAmount = Double.parseDouble(key.readLine());

        //Calculates for the compounded amount and years required to reach target amount
        while (currentAmount < targetAmount){

            compoundedAmount = (interestRate/100)*(currentAmount + investedAmount);
            currentAmount += (compoundedAmount + investedAmount);

            targetTime++;
        }

        //Output final results
        System.out.println("The target amount will be earned in "+ targetTime +" years.");
    }

}

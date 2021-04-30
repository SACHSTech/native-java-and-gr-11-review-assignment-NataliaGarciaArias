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
        double investedAmount = 0;
        double interestRate = 0;
        double targetAmount = 0;
        double currentAmount = 0;
        double compoundedAmount = 0;
        int targetTime = 0;


        //Prompt for user input
        System.out.print("Enter the yearly invested amount: ");
        investedAmount = Double.parseDouble(key.readLine());

        System.out.print("Enter the compound interest rate: ");
        interestRate = Double.parseDouble(key.readLine());

        System.out.print("Enter the target amount: ");
        targetAmount = Double.parseDouble(key.readLine());

        //Calculate
        while (currentAmount < targetAmount){

            compoundedAmount = (interestRate/100)*(investedAmount);
            currentAmount = compoundedAmount + investedAmount;
            targetTime++;
        }

        //Print results
        System.out.println("The target amount will be earned in "+ targetTime +" years.");
    }

}

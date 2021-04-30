package gr11review.part1;
import java.io.*;

/**
 * This program Review1.java lets the user enter a month number and day,
 * then prints the day of the year in which it lies on. 
 * @author: N. Garcia-Arias
 * 
 */
public class Review1{
    public static void main(String[] args) throws IOException{

        //Create variables and create an array storing the number of days in a month
        int numMonth;
        int numDay;
        int[] listDaysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumDaysInMonths = 0;
        int numDayOfYear;
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        //Ask user to for the month and day numbers
        System.out.print("Enter the month number: ");
        numMonth = Integer.parseInt(key.readLine());

        System.out.print("Enter the day number: ");
        numDay = Integer.parseInt(key.readLine());

        for (int i = 0; i < (numMonth - 1); i++){
            sumDaysInMonths += listDaysInMonths[i];
        }
        
        //Print the day of the year
        numDayOfYear = numDay + sumDaysInMonths;
        System.out.println(numDayOfYear);
    }
}
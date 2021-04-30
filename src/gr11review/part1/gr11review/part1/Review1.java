package gr11review.part1;
import java.io.*;

public class Review1{
    public static void main(String[] args) throws IOException{

        //Declare Variables

        int numMonth;
        int numDay;
        int[] listMonthsInDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numDayOfYear = 0;

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the month number: ");
        numMonth = Integer.parseInt(key.readLine());

        System.out.print("Enter the day number: ");
        numDay = Integer.parseInt(key.readLine());

    }
}
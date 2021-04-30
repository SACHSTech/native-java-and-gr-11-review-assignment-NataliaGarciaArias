package gr11review.part1;
import java.io.*;
/**
 * Block comment here
 * @author: N. Garcia-Arias
 */

 public class Review2{
     public static void main(String[] args) throws IOException{
        
        //Create variables
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        int userInput;

        //Print Options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        //Ask for user input
        System.out.println("Choose a menu option: ");
        userInput = key.read();


        switch (userInput){
            case 0:
                //System.out.println("joke about hair");
                break;
            case 1;
                //System.out.println("joke about feet");
                break;
            case 2;
                //System.out.println("joke about clothes");
                break;
            case 3;
                //System.out.println("joke about teacher");
                break;
            default:
                System.out.println("Invalid menu option");


        }


     }
 }
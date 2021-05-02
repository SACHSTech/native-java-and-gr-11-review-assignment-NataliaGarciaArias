package gr11review.part1;
import java.io.*;
/**
 * This program Review2.java prompts a menu and outputs a joke
 * in response to the user's input.
 * @author: N. Garcia-Arias
 */

 public class Review2{
     public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        //Create variables for user input
        int userInput;

        //Print Options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        //Ask for user input
        System.out.print("Choose a menu option: ");
        userInput = Integer.parseInt(key.readLine());

        //Compare value against each case and execute the corresponding output
        switch (userInput){
            case 0:
                System.out.println("Why do bees have sticky hair?");
                System.out.println("They always use honeycombs.");
                break;
            case 1:
                System.out.println("Why do people like foot massages?");
                System.out.println("They are good for the sole.");
                break;
            case 2:
                System.out.println("What do you call a jacket that catches on fire?");
                System.out.println("A blazer!");
                break;
            case 3:
                System.out.println("Why did Mr. Fabroa wear sunglasses to class?");
                System.out.println("Because his class was so bright!");
                break;
            default:
                System.out.println("Invalid menu option");


        }


     }
 }
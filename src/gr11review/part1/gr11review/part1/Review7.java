package gr11review.part1;
import java.io.*;
/**
 * Block comment
 * @author N. Garcia-Arias
 * 
 */

public class Review7{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        //Created variables
        String theSentence;
        int theLength;
        int theSpaces;
        char someChar = 'a';
        int countA = 0;
        int oddCharacters;
        
        //Prompt user to enter a sentence
        theSentence = key.readLine();

        //Calculate the length of the sentence
        theLength = theSentence.length();

        //Remove the whitespaces from the sentence and calculate the difference
        theSpaces = theLength - theSentence.replaceAll(" ", "").length();

        for(int i = 0; i < theLength; i++){
            //Calculate the instances of the letter 'a'
            if(theSentence.charAt(i) == someChar){
                countA++;
            }
        }

        //Calculate the # of odd characters in the sentence
        oddCharacters = (theLength + 1)/2;

        //Print results
        System.out.println("There are "+ theLength + " characters in the sentence.");
        System.out.println("There are "+ theSpaces + " spaces in the sentence.");
        System.out.println("There are "+ countA + " letter a in the sentence.");

        //Print string with as many dashes "-" as there are odd numbered characters
        for(int c = 0; c < oddCharacters; c++){
            System.out.print("-");
        }
    }
}

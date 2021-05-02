package gr11review.part1;
import java.io.*;
/**
 * This program Review8.java simulates 1000 slot machine pulls and
 * each pull generates 3 random numbers. These random values are
 * outputted along with the number of times a triple was pulled.
 * @author N. Garcia-Arias
 * 
 */
public class Review8{
    public static void main(String[] args) throws IOException{

        //Create variables
        int random1 = 0;
        int random2 = 0;
        int random3 = 0;
        int tripleCount = 0;

        for (int i = 0; i < 1000; i++){

            //Generate 3 random numbers between 0 and 8
            random1 = (int)(Math.random() * ((8 - 0) + 1));
            random2 = (int)(Math.random() * ((8 - 0) + 1));
            random3 = (int)(Math.random() * ((8 - 0) + 1));

            //Count times the slot machine pulls 3 identical numbers
            if (random1 == random2 && random2 == random3 && random1 == random3){
                tripleCount++;
            }

            //Output the 3 random numbers per line
            System.out.println(random1 + " " + random2 + " " + random3);
        }

        //Output the total # of triples pulled
        System.out.println(tripleCount);
    }
}

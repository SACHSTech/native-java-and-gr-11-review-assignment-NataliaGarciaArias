package gr11review.part1;
import java.io.*;
/**
 * Block comment
 * @author N. Garcia-Arias
 * 
 */
public class Review8{
    public static void main(String[] args) throws IOException{

        //Create variables
        int random1 = 0;
        int random2 = 0;
        int random3 = 0;

        for(int i = 0; i < 1000; i++){

            random1 = (int)(Math.random() * ((8 - 0) + 1));
            random2 = (int)(Math.random() * ((8 - 0) + 1));
            random3 = (int)(Math.random() * ((8 - 0) + 1));

            System.out.println(random1 + " " + random2 + " " + random3);
        }

    }
}

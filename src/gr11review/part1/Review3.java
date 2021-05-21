package gr11review.part1;
import java.io.*;
/**
 * This program Review3.java prints odd numbers from 20 to 100
 * and numbers from 29 to 2 in decreasing order.
 * @author: N. Garcia-Arias
 */
 public class Review3{
     public static void main(String[] args) throws IOException{
        
        //Print odd numbers from 20 to 100
        for (int i = 20; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
         }

        //Print blank line that separates both loops
        System.out.println("");

        //Print numbers from 29 to 2 in decreasing order
        for (int d = 29; d >= 2; d--){
            System.out.println(d);
        }
     }
 }

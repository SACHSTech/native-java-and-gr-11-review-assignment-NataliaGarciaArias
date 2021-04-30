package gr11review.part1;
import java.io.*;
/**
 * Block comment here
 * @author: N. Garcia-Arias
 */

 public class Review3{
     public static void main(String[] args) throws IOException{
        
        //Print odd numbers from 20 - 100
        for (int i = 20; i <= 100; i++){
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
         }

        //Blank line to separate
        System.out.println(" \n");

        //Print numbers from 29 - 2 in decreasing order
        for (int d = 29; d >= 2; d--){
            System.out.print(d + " ");
        }
     }
 }
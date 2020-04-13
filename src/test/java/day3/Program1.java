package day3;

/*
 * Write a Java program to get the character at the given index within the String.
 * @Author: Aravinda
 */

import java.util.Scanner;

public class Program1 {


    public static void main(String arg[]){



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index ");
        int inx = sc.nextInt();

        System.out.println("Enter a stm: ");
        String stm = sc.next();


        Program1 pgm = new Program1();

        char vl =  pgm.getCharIndex(stm,inx);
        System.out.println(vl);


    }


    public char getCharIndex(String stm , int index){

        char val = stm.charAt(index);
        return val;
    }


}

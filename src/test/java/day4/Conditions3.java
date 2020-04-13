package day4;

//import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class Conditions3 {


    public static void main(String arg[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        if(marks<35){
            System.out.println("Fail");
        }else if (marks>=35 && marks <45){
            System.out.println("Pass Class");
        }else if (marks>=45 && marks <55){
            System.out.println("Second Class");
        }else if (marks>=55 && marks <75){
            System.out.println("First Class");
        }else if (marks>=75 && marks <=100){
            System.out.println("Top Class");
        }else{
            System.out.println("Contact admin");
        }
    }
}

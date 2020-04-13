package day4;

import java.lang.String;

import java.util.Scanner;

public class Conditions4 {


    public static void main(String arg[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month ");

        int month = sc.nextInt();


        switch (month) {
            case 1:
                System.out.println("Jan month");

                break;
            case 2:
                System.out.println("Feb month");

                break;
            case 3:
                System.out.println("Mar month");

                break;
            case 4:
                System.out.println("Apr month");

                break;
            case 5:
                System.out.println("May month");

                break;
            case 6:

                System.out.println("June month");

                break;
            case 7:
                System.out.println("july month");

                break;
            case 8:
                System.out.println("Aug month");

                break;
            case 9:
                System.out.println("Sep month");

                break;

            default:
                System.out.println("Enter correct month");
                break;
        }



        }
}

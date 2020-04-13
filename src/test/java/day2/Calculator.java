package day2;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;


public class Calculator {

    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();

        Calculator cal = new Calculator();
        cal.mulOfTwoNum(num1,num2);
       int div = cal.div(num1,num2);
       System.out.println("Division of two numbers "+div);
        cal.addTwoNumber(num1,num2);


    }



    //This is a non static method
    //access modifier, return type, method name (argument)
    public void addTwoNumber(int a, int b){
        int sum = a + b;
        System.out.println("Addition of "+a+" and "+b+" numbers is "+sum);
    }

    public void mulOfTwoNum(int a, int b){
        int mul = a * b;
        System.out.println("Multiplication of "+a+" and "+b+" numbers is "+mul);
    }

    public int div(int a, int b){
        int divof = a/b;
        return divof;
    }

}

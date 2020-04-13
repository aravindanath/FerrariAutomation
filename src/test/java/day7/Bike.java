package day7;

import java.util.Scanner;

public class Bike {

    Bike(){
        System.out.println("Launching the chrome");
        System.out.println("Default constructor");
    }
// COnstructor overloading

    Bike(int cc){
        System.out.println("CC :"+cc);
    }

    Bike(int cc,int mod){
        System.out.println("CC :"+cc);
        System.out.println("Model :"+mod);
    }


    Bike(int cc,int mod,String brand, float milage, long chasis){
        System.out.println("CC :"+cc);
        System.out.println("Model :"+mod);
        System.out.println("brand :"+brand);
        System.out.println("Milage :"+milage);
        System.out.println("Chasis :"+chasis);
    }



    public static void main(String arg[]){
//        new Bike(120);
      //Class ref =  //Object of the class
       Bike b = new Bike(120,2020,"hero",33.5f,2345234523452l);
       b.bike();
//                new Bike(130);
//                new Bike() ;



    }


    public void bike(){
       System.out.println("I am bike method");
    }




}

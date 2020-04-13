package day6;

public class GlobalLocalVar {

   //Global non static varible
    String pin ="560037";
    static String city = "Bangalore";
    static String temp = "33.4C";


    public static void main(String arg[]){




        Practice2.demo();




    }


    public void student(String name,int roll){
        //Local varaible
        System.out.println("*******************************");
        float per = 44.4f;
        System.out.println("Student name is "+ name);
        System.out.println("Student roll is "+ roll);
        System.out.println("Student belongs to "+ city);
        System.out.println("Student per is "+ per);

    }


    public static void finalStudent(String name,int roll,String collage, float per){

        System.out.println("Student name is "+ name);
        System.out.println("Student roll is "+ roll);
        System.out.println("Student belongs to "+ city);
        System.out.println("Student per is "+ per);
        System.out.println("Student is  studying in"+ collage);


    }



}

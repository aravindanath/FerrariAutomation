package day9;

public class ExceptionHandling5 {


    public static void main(String arg[]){

        System.out.println("Starting ....");
        System.out.println("OPEN DB ....");
    try {

        int i = 10/0;
        System.out.println(i);


    }catch (Exception e){
        e.printStackTrace();

    }



    finally {
        System.out.println("db close");
        System.out.println("Finally block...");
    }


        System.out.println("Ending ....");


    }

}

package day9;

public class ExceptionHandling7 {


    public static void main(String arg[]){

        System.out.println("Starting ....");
        System.out.println("OPEN DB ....");
    try {

       String name = null;

       System.out.println(name.length());


    }

    finally {
        System.out.println("db close");
        System.out.println("Finally block...");
    }


        System.out.println("Ending ....");


    }

}

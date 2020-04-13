package day9;

public class ExceptionHandling6 {


    public static void main(String arg[]){

        System.out.println("Starting ....");
        System.out.println("OPEN DB ....");
    try {

       String name = null;

       System.out.println(name.length());


    }catch (ArithmeticException e){
        e.printStackTrace();

    }catch (ArrayIndexOutOfBoundsException a){
        a.printStackTrace();
    }catch (NullPointerException n){
        n.printStackTrace();
    }



    finally {
        System.out.println("db close");
        System.out.println("Finally block...");
    }


        System.out.println("Ending ....");


    }

}

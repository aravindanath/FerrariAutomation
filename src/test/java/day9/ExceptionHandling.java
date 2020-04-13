package day9;

public class ExceptionHandling {


    public static void main(String arg[]){

        System.out.println("Starting ....");

        try {
            int a = 10;
            int b = 0;
            int sum = a / b;
            System.out.println(sum);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Ending ....");


    }

}

package day9;

public class ExceptionHandling3 {


    public static void main(String arg[]){

        System.out.println("Starting ....");
    try {
        int i[] = new int[3];
        i[0] = 3123;
        i[1] = 2345;
        i[2] = 13262;
        i[3] = 24562;
        System.out.println(i[3]);
    }catch (ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
    }finally {
        System.out.println("Finally block...");
    }


        System.out.println("Ending ....");


    }

}

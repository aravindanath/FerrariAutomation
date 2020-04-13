package day6;

public class Practice2 {


    int pin = 3456;

    static String area = "Marathalli";


    public static void main(String arg[]){

        System.out.println(area);
        demo();
        Practice2 p = new Practice2();
        p.nonStaticMethod();

    }


    public static void demo(){

        System.out.println("This is a DEMO");


    }


    public void nonStaticMethod(){

        System.out.println(pin);
        System.out.println(area="BTM");

    }


}

package day3;

public class StringManupulation2 {


    public static void main(String arg[]){

       String msg = "Work from home till march 31th";

       System.out.println(msg.length());


       String msg1 = "Arvind_56789deepal";

       System.out.println(msg1);

       String name = msg1.split("_")[0];
       String num = msg1.split("_")[1];
       String n1 = msg1.split("9")[0];
        String n2 = msg1.split("9")[1];

       System.out.println(n1);
        System.out.println(n2);



    }
}

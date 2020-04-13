package day3;

public class StringManupulation3 {


    public static void main(String arg[]){

       String msg = "Work from home till march 31th";


       String s = msg.substring(0,15).toUpperCase()+msg.substring(15);


       System.out.println(s);

        String msg1 = "Arvind_56789deepal";

        String s1 = msg1.substring(0,12);
        System.out.println(s1);

    }
}

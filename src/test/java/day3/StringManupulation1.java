package day3;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StringManupulation1 {


    public static void main(String arg[]){

        /*
        == and equal (equalsIgnoreCase)
         */


        int a  = 10;
        int b = 20;
        System.out.println(a==b);

        String name = "Deepal";
        String name2 = "arvind";
        System.out.println(name==name2);

        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

        if(name.equals(name2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }


        if(name.equalsIgnoreCase("Arvind")){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }
}

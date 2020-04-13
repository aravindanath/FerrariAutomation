package day3;

public class StringManupulation5 {


    public static void main(String arg[]){

       String msg = "work from home till march";


        for (String str : msg.split(" ")) {

            System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
        }


    }
}

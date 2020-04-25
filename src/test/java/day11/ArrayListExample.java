package day11;



import java.util.*;


public class ArrayListExample {


    public static void main(String arg[]){


        ArrayList<String> std = new ArrayList<String>();
        std.add("Sarvani"); //0
        std.add("Md");//1
        std.add("Arsha");//2
        std.add("abhi");//3

        System.out.println(std.size());

        for(int i=0;i<std.size();i++){
            System.out.println(std.get(i));
        }

        for(String str : std){
            System.out.println(str);
        }




    }
}

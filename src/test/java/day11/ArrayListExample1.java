package day11;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample1 {


    public static void main(String arg[]){


        ArrayList<String> std = new ArrayList<String>();
        std.add("Sarvani"); //0
        std.add("Md");//1
        std.add("Arsha");//2
        std.add("abhi");//3

        ArrayList<String> std2 = new ArrayList<>();
        std2.addAll(std);
        std2.add("Arvind");
        std2.add("Bharath");
        std2.add("Md");


        System.out.println(std2);
        System.out.println(std2.remove("xr"));
        System.out.println(std2.remove(3));
        System.out.println(std2);

        Collections.sort(std2);

        System.out.println(std2);

        for(String str : std2){
            if(str.contains("Sarvani")){
                System.out.println("Found "+str);

            } else{
                System.out.println("Not Found ");
            }


        }

    }
}

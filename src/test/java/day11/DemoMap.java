package day11;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String arg[]){


        Map<Integer,String> m = new HashMap<Integer,String>();

        m.put(101,"arvind");
        m.put(102,"Arsha");
        m.put(103,"md");
        m.put(104,"Abhi");
        m.put(101,"Ravi");

        HashMap<Integer,String> m1 = new HashMap<Integer,String>();
        m1.putAll(m);
        m1.put(105,"Avneesh");


        System.out.println(m.get(102));
        System.out.println(m1);






    }
}

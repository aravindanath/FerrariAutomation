package day11;



import sun.lwawt.macosx.CSystemTray;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoMap3 {

    public static void main(String arg[]){


        HashMap<Integer,String> m = new HashMap<Integer,String>();

        m.put(101,"arvind");
        m.put(102,"Arsha");
        m.put(103,"md");
        m.put(104,"Abhi");
        m.put(101,"Ravi");
        m.put(null,null);
        System.out.println(m.get(104));

        Hashtable<Integer,String> m1 = new Hashtable<Integer,String>();
        m1.put(105,"Avneesh");
        m1.put(null,null);

        System.out.println(m1);






    }
}

package day11;

import com.google.gson.internal.$Gson$Preconditions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {

    public static void main(String arg[]){

        HashSet<String> set = new HashSet<String>();
        set.add("Arvind");
        set.add("Arvind");
        set.add("Jyothi");
        set.add("Ravi");
        set.add("Pushpa");
        set.add("Ravi");


        System.out.println("Count of values "+set.size());

//            for(String str : set){
//                System.out.println(str);
//            }

         Iterator itr = set.iterator();
         while (itr.hasNext()) {
             System.out.println(itr.next());
         }

    }

}

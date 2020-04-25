package day11;

import com.google.gson.internal.$Gson$Preconditions;
import sun.lwawt.macosx.CSystemTray;

import java.util.*;

public class DemoMap1 {

    public static void main(String arg[]){

        // key , value

        /**
         *  a = {apple, alphabelt, audi}
         *  b = {bluetooth, blupnth, bluff}
         *  101 = arvid
         *
         */

        ArrayList<String> a = new ArrayList<String>();
        a.add("Apple");
        a.add("Audi");
        a.add("Alphabet");
        a.add("Ameba");
        Collections.sort(a);

        ArrayList<String> b = new ArrayList<String>();
        b.add("Bluetooth");
        b.add("Blue");
        b.add("Bloom");
        b.add("Bluff");
        Collections.sort(b);

        Map<Character, List<String>> m = new HashMap<Character, List<String>>();
        m.put('A',a);
        m.put('B',b);

        for(Map.Entry mp : m.entrySet()){
            System.out.println(mp);
        }
    }
}

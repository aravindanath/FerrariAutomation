package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WriteTOProp {


    public static void main(String arg[]) throws Exception {

        Genric.setVal("url", "https://www.amazon.com", "data");
        Genric.setVal("url", "https://www.flipkart.com", "test");
        
        System.out.println(Genric.getVal("url", "test"));
        String val = Genric.getVal("url", "data");
        System.out.println(val);
    }
}

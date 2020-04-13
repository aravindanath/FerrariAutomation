package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {


    public static void main(String arg[]) throws Exception {

        String path = System.getProperty("user.dir")+ File.separator+"testData"+File.separator+"config.properties";

        FileInputStream fis = new FileInputStream(path);

        Properties prop = new Properties();

        prop.load(fis);

        System.out.println(prop.get("search"));



    }
}

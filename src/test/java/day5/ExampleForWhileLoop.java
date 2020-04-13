package day5;

import java.io.*;

public class ExampleForWhileLoop {


    public static void main(String arg[]) throws IOException {

        File f = new File("./Files/Demo.txt");
        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);

        String x ="";

        while ((x=br.readLine())!=null){
            System.out.println(x);
        }

    }

}

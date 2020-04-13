package day9;

import java.io.*;

public class ExceptionHandling8 {


    public static void main(String arg[]) throws IOException {

        System.out.println("Starting ....");
        System.out.println("OPEN DB ....");

        FileInputStream f = new FileInputStream("./demo/text.txt");
        System.out.println(f.read());


        System.out.println("Ending ....");


    }

}

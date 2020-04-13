package day9;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionHandling9 {

//https://www.browserstack.com/guide/exceptions-in-selenium-webdriver
    public static void main(String arg[]) throws Exception {


        int amt = 99;

        if(amt >= 100){
            System.out.println("Pls withdraw");
        }else if(amt<100){
            throw new Exception("Pls enter > 100");
        }


    }

}

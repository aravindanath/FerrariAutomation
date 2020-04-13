package day3;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StringManupulation {


    public static void main(String arg[]){
//        String otp = "Hi krishna, OTP 536622 is for completing ur txn";
                    //01234234567890
        String stm = "Get well soon from carona";

        System.out.println(stm.toUpperCase());
        System.out.println(stm.length());
        System.out.println(stm.toLowerCase());

        String browser = "chRomE";
        String bre = "CHROME";

        System.out.println(browser.hashCode());
        System.out.println(bre.hashCode());


        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("vaild");
        }else {
            System.out.println("In vaild");
        }


    }
}

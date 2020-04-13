package day3;

public class RegexExamples {


    public static void main(String arg[]){

       String msg = "Sharvani 3445 bangalore";

        String msg1 = "3456789 ABX 987654";

        for (String str : msg.split(" ")) {
            if (str.matches("\\d{4}")) {
                System.out.println(str);
            }


            for (String str1 : msg1.split(" ")) {
                if (str1.matches("\\w{3}")) {
                    System.out.println(str1);
                }





            }
}}}

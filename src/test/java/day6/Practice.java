package day6;

public class Practice {



    //Global // instance
    String city;
    int pin = 7888;
    String area;

    public static void main(String arg[]){
        Practice p = new Practice();
        p.demo();
        p.demo2();
        System.out.println(p.pin);
    }



    public void demo() {
        //Local
        area = "Maarathalli";
        System.out.println(city);
    }

    public void demo2(){
        area = "kundanalli";
        System.out.println(city);
        System.out.println(pin);
        System.out.println(area);
    }



}

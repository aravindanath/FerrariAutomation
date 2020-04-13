package day9;

public class Kar extends MinOfTransport{


    void roadways(){
        System.out.println("Road ways..");
    }
    void waterways(){
        System.out.println("Water ways..");
    }

    public static void main(String []arg){

        Kar k = new Kar();
        k.roadways();
        k.airways();
        k.waterways();

        k.SCR();
        k.SWR();
        k.banking();
    }



    void SWR() {
        System.out.println("SWR");
    }

    void SCR() {
        System.out.println("SCR");
    }
}

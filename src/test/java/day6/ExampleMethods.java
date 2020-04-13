package day6;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ExampleMethods {


    public static void main(String arg[]){

        ExampleMethods e = new ExampleMethods();
        e.addNum(2,3);
        e.addNum(1,3,5);
//        e.student("Arvind",111,99.99f,'A',2020);
        

        GlobalLocalVar.finalStudent("Archna",6543,"BU",76.5f);

        GlobalLocalVar g = new GlobalLocalVar();
        g.student("Deepal",3234);

        System.out.println(GlobalLocalVar.city);
        System.out.println(g.pin);

    }



    public void addNum(int i ,int z){
        int sum = i+z;
        System.out.println(sum);
    }

    // Method over loading

    public void addNum(int i ,int z,int x){
        int sum = i+z+x;
        System.out.println(sum);
    }

    public void student(String name, int roll , float per, char sec){
        System.out.println("Student name is "+ name);
        System.out.println("Student roll is "+ roll);
        System.out.println("Student per is "+ per);
        System.out.println("Student belongs to section "+ sec);
    }
    public void student(String name, int roll , float per, char sec,int year){
        System.out.println("Student name is "+ name);
        System.out.println("Student roll is "+ roll);
        System.out.println("Student per is "+ per);
        System.out.println("Student belongs to section "+ sec);
        System.out.println("Student admin year "+ year);

    }




}

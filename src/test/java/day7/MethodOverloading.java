package day7;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class MethodOverloading {

    public static void main(String arg[]){
        MethodOverloading m =  new MethodOverloading();
        m.click("Button");
        m.click("Button",33,55);

    }

    public void click(String ele){

        System.out.println("Click using "+ele);
    }

    public void click(String ele,int x , int y){

        System.out.println("Click using "+ele);
        System.out.println("Click using "+x + y+" coordinated");
    }
}

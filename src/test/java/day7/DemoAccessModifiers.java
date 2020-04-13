package day7;

public class DemoAccessModifiers {

    /**
     * 1. public
     * 2. private
     * 3. protected
     * 4. default
     *
     */

    public void pubMethod(){
        System.out.println("Public method");
    }

    private void pvtMethod(){
        System.out.println("private method");
    }

    protected void proMethod(){
        System.out.println("protected method");
    }


     void defMethod(){
         System.out.println("default method");
     }



    public static void main(String arg[]){

        DemoAccessModifiers da = new DemoAccessModifiers();
        da.defMethod();
        da.proMethod();
        da.pubMethod();
        da.pvtMethod();

    }


}

//sub class
class  DemoAccessModi1{




}

package day9;

public abstract class MinOfTransport  extends MinOfRailways{

    // Abstract methods

    abstract void roadways();
    abstract void waterways();

    // non abstract methods

    public void airways(){
        System.out.println("Airways...");
    }




}

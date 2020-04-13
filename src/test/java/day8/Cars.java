package day8;

import day5.ThreeM;
//Parent /Base class/ Super class

/**
 * 
 * @author aravindanathdm
 *		
 *		BMW ---> Car ----> ThreeM ( Multi level)
 *		BMW ---> Car (Single level)
 *
 */
public class Cars  extends Bike{
	
	public static void main(String[] args) {
		Cars c = new Cars();
		c.cc(33);
		c.model(2022);
        c.bikeCC();
        c.wiper();

	}
	
	public void cc(int cc) {
		
		System.out.println("Car cc is "+ cc);
	}
	
	public void model(int model) {
		
		System.out.println("Model cc is "+ model);
	}
	

}

class Bike extends ThreeM{
	
	
	public void bikeCC() {
		
		System.out.println("Bike CC");
	}
	
	
}

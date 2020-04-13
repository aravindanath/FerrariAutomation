package day9;

import day8.Cars;

public class BMW  extends Cars {
	
	
	
	public static void main(String[] args) {
		BMW b = new BMW();
		b.cc(2222);
		b.model(2020);
		b.sunroof();

	}
	
	
	public void sunroof() {
		System.out.println("Sunroof");
	}
	

}

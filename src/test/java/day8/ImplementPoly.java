package day8;

 

public class ImplementPoly {
	
	
	public static void main(String[] args) {
		
		//RBI rbi; // Parent Class ref
		RBI  rbi = new SBI();// child class object
		System.out.println("SBI Int "+rbi.moratoriumInt());
		
	//	rbi = new HDFC();
	//	System.out.println("HDFC Int "+rbi.moratoriumInt());
		//Parent
 
		
	}
	
	//Compile time polymorphsim
	// overloading static method
	
	public static void click(String ele) {
		System.out.println("CLick with element");
		
	}
	
	public static void click(String ele,int x, int y) {
		System.out.println("CLick with element and co ordinates");
	}
	
	

}

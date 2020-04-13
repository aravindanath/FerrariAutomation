package day8;

public class Kar extends MinOFTransport{

 
	void roadways() {
		System.out.println("Roadways of Karnataka"); 
		
	}

 
	void waterways() {
		 
		System.out.println("Waterways of Karnataka"); 
	}

	
	public static void main(String[] args) {
		Kar k = new Kar();
		k.airways();
		k.waterways();
		k.roadways();
		
	}
}

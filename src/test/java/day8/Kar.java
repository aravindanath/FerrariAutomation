package day8;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Kar extends MinOFTransport implements CovidTaskForce,MinOFHealth{

 
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
		k.lockdown();
		k.takeHQC();
		
	}


	public void lockdown() {
		System.out.println("Bangalore is fully lockdown");

	}

	@Override
	public void takeHQC() {
		System.out.println("Affected ppl  need to take HQC");
	}
}

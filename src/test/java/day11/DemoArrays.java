package day11;

public class DemoArrays {

	public static void main(String[] args) {
		
		//            0,1,2,3,4,5,6,7....
		int roll[] = {101,122,133,221,244,567,888};
		
//		System.out.println(roll[3]);
//		System.out.print(roll.length);
		
 
		
		for(int i=0;i<roll.length;i++) {
			System.out.println(roll[i]);
		}
		
		System.out.println("*******************");
		
		for(int r : roll) {
			System.out.println(r);
		}
		
	 

	}

}

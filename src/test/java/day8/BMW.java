package day8;

public class BMW  extends Cars{
	
	
	
	public static void main(String[] args) {
		BMW b = new BMW();
		b.cc(2222);
		b.model(2020);
		b.sunroof();
		b.wiper();
	}
	
	
	public void sunroof() {
		System.out.println("Sunroof");
	}
	

}

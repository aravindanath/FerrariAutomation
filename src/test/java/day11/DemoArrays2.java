package day11;

public class DemoArrays2 {

	public static void main(String[] args) {
	   	String std1[] = {"Arvind","Kumar","Mani","karthik"};
		 String std[] = new String[4];//0,1,2,3
		 std[0]="Ramya";
		 std[3]="Arsha";
		 std[1]="Md";
		 std[2]="Abhi";
 
		 
		 System.out.println(std.length);
		 
		for(String str : std) {
			System.out.println(str);
		}


		for(int i=0;i<std1.length;i++) {
			 System.out.println(std1[i]);
		 }
		 
	}

}

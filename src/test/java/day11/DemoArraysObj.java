package day11;

public class DemoArraysObj {

	public static void main(String[] args) {
	   
		 Object std[] = new Object[8];//0,1,2,3
		 std[0]="Ramya";
		 std[3]="Arsha";
		 std[1]="Md";
		 std[2]="Abhi";
		 std[5]=23452;
		 std[4]=443.77;
		 std[6]='S';
		 std[7]=true;
 
		 
		 System.out.println(std.length);
		 
		 for(Object str : std) {
			 System.out.println(str);
		 }
	 

		  
		 
	}

}

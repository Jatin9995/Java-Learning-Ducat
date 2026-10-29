package Methods;


//Maximum between 4 variables

public class Maximum {
	
 public static void isMaximum(int a, int b, int c, int d) {
	 
	 if(a>b && a>c && a>d) {
		 System.out.println("A is maximum :" + a);
		 
	 }else if(b>a && b>c && b>d) {
		 System.out.println("B is maximum :" + b);
		 
	 }else if (c>a && c>b && c>d) {
		 System.out.println("C is maximum :" + c);
		 
	 }else {
		System.out.println("D is maximum :" +d);
	}
	 
	 
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		isMaximum(5, 4, 3, 2);
		
		
	}

}

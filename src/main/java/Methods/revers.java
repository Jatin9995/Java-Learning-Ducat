package Methods;

public class revers {
	
	public static void reverseValue(int n) {
		int rev=0;
		
		for (; n>0 ;) {
			
			rev=(rev*10) + (n%10);
			n=n/10;
			
			
		}
		
		
		System.out.println("Reverse value :" + rev);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseValue(199);

	}

}

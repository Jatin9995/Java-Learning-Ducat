package Methods;

public class palindrome {
	
	
	public static void reverseValue(int n) {
		int rev=0;
		int temp=n;
		
		for (; n>0 ;) {
			
			rev=(rev*10) + (n%10);
			n=n/10;
					
		}
		
		
		System.out.println("Reverse value :" + rev);
		
		if (rev==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseValue(555);

	}

}

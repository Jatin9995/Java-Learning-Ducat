package Methods;

public class factorial {
	
	public static void calculateFactorial(int n) {
		
		int factorial=1;
		
		for(int i=1; i<=n; i++) {
			factorial=factorial * i;
			
		}
		
		System.out.println(factorial);
		
	}

	public static void main(String[] args) {
		
		calculateFactorial(5);
		
		
		
		

	}

}

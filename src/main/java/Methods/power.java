package Methods;

public class power {
	
	
	public static void calculatePower(int base, int exponent) {
		
		int result=1;
		
		for(int i=1; i<=exponent; i++) {
			
			result = result * base;
			
		}
		
		System.out.println(result);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculatePower(2, 5);
		
	}

}

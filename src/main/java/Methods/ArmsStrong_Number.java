package Methods;

public class ArmsStrong_Number {
	
	
	public static int digitCounter(int n) {
		
		int count=0;
		
		while (n>0) {
			count = count+1;
			n=n/10;
			
		}
		
		return count;
		
	}
	
	
	public static int power(int base, int exp) {
		int result=1;
		for (int i=1; i<=exp; i++) {
			result=result * base;
		}
		
		return result;
		
	}
	
	
	public static boolean isArmstrong(int n) {
		int reminder=0, sum=0, actualValue=n; 
		int pow=digitCounter(n);
		
		while(n>0) {
			reminder=n%10;
			sum=sum + power(reminder, pow);
			n=n/10;
			
		}		
		
		System.out.println("sum of raise to the power of given digit : " + sum);
	
		if(sum==actualValue) {
			return true;
			
		}else {
			return false;
		}
		
		
	}
	

	public static void main(String[] args) {
		int num=153;
		System.out.println("Actual Number Given :" + num);
		if(isArmstrong(num)) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a Armstrong number");
		}
		

	}

}

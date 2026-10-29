package Practice;

public class armStrongNumber {
	
	
	public static int digitcount(int n) {
		
		int count=0;
		
		while (n>0) {
			count=count+1;
			n=n/10;
			
		}
	return count;
		
	}
	
	public static int power(int base, int exponent) {
		
		int result=1;
		
		for (int i=1; i<=exponent; i++) {
			result=result * base;
		}
		return result;
	}
	
	public static boolean isArmstrong(int n) {
		int actualNumber=n, sum=0, reminder;
		
		int pow = digitcount(n);
	while (n>0) {
		reminder=n%10;
		sum=sum + power(reminder, pow);
		n=n/10;
		
	}
	
	if (actualNumber==sum) {
		return true;
	}else {
		return false;
	}
		
		
	}
	
	

	public static void main(String[] args) {
		 int num=153;
		  if (isArmstrong(num)) {
			  System.out.println("armsStromg number");
		  }else {
			  System.out.println("Not armsStromg number");
		}
		 
		 

	}

}

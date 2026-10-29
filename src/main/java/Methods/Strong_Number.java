package Methods;


//Strong number means:- sum of factorial of each digit = original number

public class Strong_Number {
	
	public static int factorial(int n) {
		
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact=fact * i;
			
		}
		
		return fact;
		
	}
	
	public static boolean isStrong(int n ) {
		
		int reminder=0, sum=0, actualValue=n;
		
		while (n>0) {
			reminder=n%10;
			sum=sum+factorial(reminder);
			n=n/10;
		}
		
		System.out.println(sum);
		if(sum==actualValue) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=145;
		 if(isStrong(num)) {
			 System.out.println("Number is strong");
		 }else {
			System.out.println("Number is not strong");
		}

	}

}

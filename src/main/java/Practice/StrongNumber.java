package Practice;

public class StrongNumber {

	//Strong number means:- sum of factorial of each digit = original number

	public static int factorial(int n) {

		int fact=1;

		for(int i=1; i<=n; i++) {
			fact=fact*i;			
		}

		return fact;

	}

	public static boolean isStrong(int n) {

		int reminder, sum=0, actualNumber=n;

		while (n>0) {
			reminder=n%10;
			sum=sum+factorial(reminder);
			n=n/10;
		}

		if (actualNumber==sum) {

			return true;
		}else {
			return false;
		}


	}




	public static void main(String[] args) {
		
		int num=125;
		
		if (isStrong(num)) {
			System.out.println("Strong number");
			
		}else {
			System.out.println("Not a strong number");
		}


	}

}

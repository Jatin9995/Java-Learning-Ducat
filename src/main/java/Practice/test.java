package Practice;


public class test {

	/*
1. Input kya hai?
2. Output kya chahiye?
3. Number ko digit me kaise todna hai?
4. Har digit pe kya operation karna hai?
5. Final comparison kya hai?
	 */

	//Reverse number logic
	/*
	public static int isReverse(int n) {
		int rev=0;

		for (;n>0;) {

			rev=(rev*10) + (n%10);
			n=n/10;
		}
		return rev;

	}


	//Spy Number:- sum of digits == product of digits

	public static int sumOfDigits(int n) {
		int sum=0;  int digit;

		while (n>0) {
			digit=n%10;
			sum=sum + digit;
			n=n/10;
		}

		return sum;



	}

	public static int productOfDigits(int n) {
		int pro=1; int digit;

		while (n>0) {
			digit=n%10;
			pro=pro * digit;
			n=n/10;
		}

		return pro;


	}

	public static boolean isSpyNumber(int n) {
	    return sumOfDigits(n) == productOfDigits(n);
	}

	 */


	//Neon Number

	public static int power(int base, int exp ) {
		int result=1;

		for(int i=1; i<=exp; i++) {
			result= result * base;

		}

		return result;

	}

	public static int sumOfDigit(int n) {
		int sum=0; int digit;
		while (n>0) {	
			digit=n%10;
			sum=sum + digit;
			n=n/10;


		}
		return sum;

	}

	public static boolean isNeonNumber(int n) {
		int square = power(n, 2);
		int sum=sumOfDigit(square);
		return sum==n;
	}







	public static void main(String[] args) {
		/*
	System.out.println("--------------------Reverse number-------------------------------");

		int revNumber=123; 
		int reversenum=isReverse(revNumber); 
		System.out.println(reversenum);


		System.out.println("--------------------Palindrome number---------------------------------");		


		int originalNumer=555;
		int afterReverse=isReverse(originalNumer);
		System.out.println(afterReverse);

		if (afterReverse==originalNumer) {
			System.out.println("Palindrome Number");

		}else {
			System.out.println("Not a Palindrome Number");
		}







		System.out.println("-----------Spy Number-------------------------");		
        int number=143;
        if(isSpyNumber(number)) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a spy number");
        }

		 */	

		System.out.println("--------------------Neon Number-----------------------------");		

		int number=9;

		if (isNeonNumber(number)) {
			System.out.println(number + " is a Neon Number");

		}else {
			System.out.println(number + " is not a Neon Number");
		}


	}

}

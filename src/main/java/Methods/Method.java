package Methods;

public class Method {
	
	
	
	public static void minimum(int a, int b, int c) {

		if (a < b && a < c) {
			System.out.println("A is min");
		} else if (b < a && b < c) {
			System.out.println("B is min");
		} else {
			System.out.println("C is min");
		}

	}

	public static void isPrime(int n) {

		//final int x =10;
		
		
		int factorCount = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factorCount++;
			}
		}
		if (factorCount == 2) {
			System.out.println("Prime : " + factorCount);
		} else {
			System.out.println("Not Prime : " + factorCount);
		}
		System.out.println("-------------------------");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 19, n1 = 343, n2 = 444, n3 = 899, n4 = 79, n5 = 113;

		isPrime(n1);
		isPrime(n2);
		isPrime(n3);
		isPrime(n4);
		isPrime(n5);
		isPrime(453);
		isPrime(233);
		isPrime(155);

		minimum(223, n1, n5);
		

	}

}

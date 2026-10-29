package Methods;


//print factor of a given integer
//static method: static method can be called without creating the object of the class. It is called directly by the name of the method.
//Within the same class it is called. same is with the static variable.

public class factor {
	
	public static void Factor(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			
			if (n%i==0) {
				System.out.println("Factor: " + i);
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Factor(25);
		

	}

}

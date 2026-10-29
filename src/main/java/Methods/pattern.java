package Methods;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int i,j,s;
		 int n=5;
		 
	/*for(i=1; i<=n; i++ ) {
		
		for(j=1; j<=(2*i)-1; j++) {
			if(j==1|| i==n|| j==(2*i)-1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
	}

	
	System.out.println("//----------------------------------------------------------------------------//");
	
	
	for(i=1; i<=n; i++) {
		
		for(s=1; s<=2*(n-i); s++) {
			System.out.print(" ");
			
		}
		
		for(j=1; j<=(2*i)-1; j++) {
			if(j==1 ||j==(2*i)-1|| i==n) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		
		System.out.println();
	}
	
	*/
	
System.out.println("//------------------------------------------------------------------------------------------//");
	
	
for(i=1; i<=n; i++) {
	
	for(j=1; j<=(2*i)-1; j++) {
		if(j==(2*i)-1) {
			System.out.print("*");
		}else {
		System.out.print(" ");
		}
		
	}
	
	System.out.println();
}


System.out.println("//-----------------------------------------------------------------------------------------------//");
	

for(i=1; i<=n; i++) {
	for(s=1; s<=2*(n-i); s++) {
		System.out.print(" ");
		
	}
	
	for (j=1; j<=(2*i)-1; j++) {
		if (j==1) {
			
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	}
	
	System.out.println();
}


System.out.println("//-----------------------------------------------------------------------------------------------//");

for(i=1; i<=n; i++) {
	
	for(j=1; j<=n; j++) {
		
		if(i==1|| j==1 || i==n || j==n) {
			System.out.print("* ");
		}else {
			System.out.print("  ");
		}

	}
	
	System.out.println();
}


		

	}

}

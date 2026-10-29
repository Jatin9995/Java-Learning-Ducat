package Methods;

class person2 {
	/*	Attributes / Properties / Instance var
	
instance variable mentioned inside the class are private so it cannot be accessed in main class because private variables are class specific means
they can be accessed within the same class only. 
So we need to create a method in the same class to access those variable using parameters.
Class ka agar koi variable banta hai to use reference variable kehte hai
jaise person2 jatin;   = isme jatin class ka referance variable hai and person2 user defined datatype hai.
person2 jatin=new person2();=  isme new keyword heap me memory allocate karta hai. 
Static= static memory allocation means ki fixed memory allocation.
Dynamic=jo runtime pe memory allocate hoti hai use dynamic memory allocation kehnte hai.
	  
	  */
	  
	 private int id; 
	 private int age;
	 private String name, gender;
	  
	  public void wakeup() {
		  
		  System.out.println(name + " wake up in the morning");
	  }
	  
	  public void eat() {
		  
		  System.out.println(name + " eat breakfast");
	  }
	  
	  public void Run() {
		  
		  System.out.println(name + " starts running");
	  }
	  
	  public void printDescriptions() {
		  System.out.println("ID of the person : " + id);
		  System.out.println("Age of the person : " + age);
		  System.out.println("Name of the person : " + name);
		  System.out.println("Gender of the person : " + gender);
		  
		  
	  }
	  
	  public void dependencyInjection(int id, int age, String name, String gender) {
		  this.id=id;
		  this.age=age;
		  this.name=name;
		  this.gender=gender;
		  
	  }
	  
	  
	
}



public class method3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person2 jatin=new person2();
		jatin.dependencyInjection(100,34, "Jatin Rout", "Male");
		jatin.printDescriptions();
		
				
		
		System.out.println("--------------------------------------------------------");
		
		person2 kavita=new person2();
		kavita.dependencyInjection(101, 32, "Kavita", "Female");
		kavita.printDescriptions();
		

	}

}

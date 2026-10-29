package Methods;

/*
 * static variable is a class-level variable that is shared among all instances(object) of that class. 
 * Unlike instance variables, which are recreated for every new object, a static variable exists in a single fixed location 
 * in memory for the entire duration of the program.
 * static variable got memory once in a heap. static variable can be used in static as well as in non-static method.
 * static variable can be directly called by the class name because static variable got memory in heap once the class load. so the class knows the static variable.
 * 
 */

class google{
	//static variable
	String name, department; 
    //static final String	company="Google earth"; //if final keyword is used then you cannot change the static variable name anywhere
	static String company;
	private int age, id; 

	public google(String name, String department, int age, int id) {
		this.name=name;
		this.department=department;
		this.age=age;
		this.id=id;
		
	}
	
  public void printDescription() {
	  System.out.println("Name is : " + name);
	  System.out.println("Department is : " + department);
	  System.out.println("age is : " + age);
	  System.out.println("id is : " + id);
	  System.out.println("Company name is: " + company);
	  System.out.println("-----------------------------------------------------");
	  
	  
  }
  
 


}


public class staticVariable {
	

	public static void main(String[] args) {
		
		
		
		google g=new google("Jatin", "IT", 34, 100);
		google.company="Google Earth"; // Initialized company name here. static variable
		g.printDescription();
		
		
		
		google j=new google("vijit", "IT", 36, 101);
		j.printDescription();
		
		google s=new google("shilpa", "IT", 38, 102);
		google.company="hcl"; // Changed and Initialized company name here again.
		s.printDescription();
		
		google k=new google("kavita", "medical", 30, 103);
		k.printDescription();


	}

}

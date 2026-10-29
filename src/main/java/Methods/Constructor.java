package Methods;

/*"Constructor Java mein ek special merthod hota hai jo tab execute hota hai jab aap kisi class ka object banate hain.
Iska main kaam object ke variables ko initial values dena hota hai." means instance variable to value assign karna hota hai.
*/

class hcl{
	
	private String name, department, gender;
	private int id, age;
	
	//parameterized constructor
	public hcl(String name, String department, String gender, int id, int age) {
		this.name=name;   //this.name: represent the instance variable. =name: represent parameter present in constructor. so this.name=name means that name variable mentioned in class variable is equeal to name variable mentioned in constructor variable.
		this.department=department;
		this.gender=gender;
		this.id=id;
		this.age=age;
	}
	
	public void printDescription() {
		System.out.println("Name is: " + name);
		System.out.println("Id is: " + id);
		System.out.println("age is: " + age);
		System.out.println("Department is: " + department);
		System.out.println("Gender is: " + gender);
		System.out.println("---------------------------------------------------------------");
	}
	
}


public class Constructor {

	public static void main(String[] args) {
		
		hcl jatin=new hcl("Jatin", "Technology", "Male", 100, 34);
		jatin.printDescription();
		
		hcl vijit=new hcl("Vijit", "Tecknology", "Male", 101, 32);
		vijit.printDescription();
		
		hcl shilpa= new hcl("Shilpa", "Technology", "Female", 102, 36);
		shilpa.printDescription();
		

	}

}

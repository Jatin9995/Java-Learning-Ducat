package Methods;

//

  class person {
	  
	  int id, age;
	  String name, gender;
	  
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
		// TODO Auto-generated method stub
		  System.out.println("ID of the person : " + id);
		  System.out.println("Age of the person : " + age);
		  System.out.println("Name of the person : " + name);
		  System.out.println("Gender of the person : " + gender);
		
	  }
	  
	  
	
}


public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person jatin=new person();
		jatin.id=100;
		jatin.age=34;
		jatin.name="Jatin Rout";
		jatin.gender="male";
		jatin.printDescriptions();
		jatin.wakeup();
		jatin.eat();
		jatin.Run();
		
		System.out.println("--------------------------------------------------------");
		
		person kavita=new person();
		kavita.id=101;
		kavita.age=32;
		kavita.name="Kavita Rout";
		kavita.gender="female";
		kavita.printDescriptions();
		kavita.wakeup();
		kavita.eat();
		kavita.Run();

	}

}

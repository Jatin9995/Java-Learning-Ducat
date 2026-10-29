package Methods;



 class employee{
	// Instance variable	
	int id;
	String name;
	int age;
	String profile;
	String department;

	//Instance method
	public void shift_1() {

		id=101;
		name="jatin";
		age=34;
		profile="Tester";
		department="Technology";

		print();
	}

	public void shift_2() {

		id=102;
		name="vijit";
		age=30;
		profile="Tester";
		department="Technology";

		print();
	}

	public void shift_3() {

		id=103;
		name="shilpa";
		age=36;
		profile="Tester";
		department="Technology";

		print();
	}

	public void shift_4() {

		id=104;
		name="Nitish";
		age=36;
		profile="Tester";
		department="Technology";

		print();
	}

	public void shift_5() {

		id=105;
		name="vivek";
		age=36;
		profile="Tester";
		department="Technology";

		print();
	}


	public void print() {

		System.out.println("Id of the employee: " + id);
		System.out.println("Name of the employee: " + name);
		System.out.println("Age of the employee: " + age);
		System.out.println("Profile of the employee: " + profile);
		System.out.println("Department of the employee: " + department);
		System.out.println("Shift Supervisor: " + name);

		System.out.println("---------------------------------------------------------------------");

	}


}



public class Objectclass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee jatin=new employee();
		jatin.shift_1();

		employee vijit=new employee();
		vijit.shift_2();

		employee shilpa=new employee();
		shilpa.shift_3();
		
		employee nitish=new employee();
		nitish.shift_4();
		
		employee vivek=new employee();
		vivek.shift_5();
		




	}




}

package Ducat.ducat.encapsulation;

class EmployeeManagementSystem{
	
	private int employeeId;
	private String employeeName;
	private double monthlySalary;
	

	
	public int getEmployeeId() {
		return employeeId;
	}

	
	public void setEmployeeId(int employeeId) {
		if(employeeId>=1001 && employeeId<=9999) {
		this.employeeId = employeeId;
		}else {
			System.out.println("Invalid input. Can't update");
		}
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		if(employeeName!=null && !employeeName.trim().isEmpty()) {
		this.employeeName = employeeName;
		}else {
			System.out.println("Invalid name. Can't update");
		}
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary>0) {
		this.monthlySalary = monthlySalary;
		}else {
			System.out.println("Invalid input. Can't update");
		}
	}
	
	public double getAnnualSalary() {
		return monthlySalary * 12;
		
	}
	
	
	
}

public class encapSulationTest {

	public static void main(String[] args) {
		
		EmployeeManagementSystem emp=new EmployeeManagementSystem();
		emp.setEmployeeName("Jatin Rout");
		System.out.println("Name is : " + emp.getEmployeeName());
		
		emp.setEmployeeId(1001);
		System.out.println("Employee Id is :" + emp.getEmployeeId());
		
		emp.setMonthlySalary(75000);
		System.out.println("Salary is: " + emp.getMonthlySalary());
		
		System.out.println("Annual Salary is: " + emp.getAnnualSalary());
		
		
	}

}

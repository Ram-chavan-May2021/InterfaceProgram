package bean;

public class Employee extends User {

	double salary;
	
	
	public Employee(String name,int age, double salary) {
		super(name,age);
		this.salary=salary;
		
	}

	@Override
	public void display() {
		
		System.out.println("Employee Information "+name+" "+age+" "+salary);
		
		
	}

}

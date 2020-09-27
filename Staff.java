package bean;

public class Staff extends User {
 
	String subject;
	 
	public Staff(String name,int age,String subject) {
		super(name,age);
		this.subject=subject;

	}

	@Override
	public void display() {

		System.out.println("Staff Information "+name+" "+age+" "+subject);
	}

}

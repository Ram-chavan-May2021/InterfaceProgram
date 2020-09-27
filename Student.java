package bean;

public class Student extends User {
	
 int marks;
 int rollno;
	
	public Student(String name,int age, int marks,int rollno) {
		super(name,age);
		this.marks=marks;
		this.rollno=rollno;
		
	}

	@Override
	public void display() {
		
		
		System.out.println("Student Information "+name+" "+age+" "+marks+" "+rollno);
		
	}

}

package bean;

public class Pooja implements Interf {

	@Override
	public void working() {
		
		String work="learn";
		System.out.println("Pooja working "+work);
		
	}

	@Override
	public void collge() {
			
		String college="Modern college";
		System.out.println("Pooja collge "+college);
	}

	@Override
	public void family() {
		
		String place="telangana";
		System.out.println("Pooja family place "+place);
		
	}

	@Override
	public void adharInfo() {
		
		 String adharno="1234567890";
		 
		 System.out.println("pooja adhar info "+adharno);
		
	}

}

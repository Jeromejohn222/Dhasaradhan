package org.login;

public class Employee extends Information {
	public void empId(int id) {
		// TODO Auto-generated method
		System.out.println("Emplo id is "+id);

	}
	public void empId(String name) {
		// TODO Auto-generated method stub
		System.out.println("Emply name is "+name);

	}
	public void empID(long phno) {
		// TODO Auto-generated method stub
System.out.println("Empl phno is "+phno);
	}
	public void empID(char gender) {
		// TODO Auto-generated method stub
		System.out.println("Emplo gender is "+gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E = new Employee();
		E.empID('m');
		E.empId(1234);
		E.empID(7293892);
		E.empId("Jerome");

	}

}

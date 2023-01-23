package com.oops.accessmodifier;


//User Defined class
class Employee {
	
	String eid = "E-101";
	String ename = "Pavan";
	float  esal = 5000.0f;
    String eAddress = "AP";
    String email = "abc@gmail.com";
    String ePhone = "9989568";
    
    public void getEmpDetails () {
    	
    	System.out.println("Employee Details");
    	System.out.println("=================");
    	
    	System.out.println("EmployeeId :" + eid);
    	System.out.println("EmployeeName :" + ename);
    	System.out.println("EmployeeSalary :" + esal);
    	System.out.println("EmployeeAddress :" + eAddress);
    	System.out.println("EmployeeEmail:" + email);
    	System.out.println("EmployeePhoneNumber :" + ePhone);
    }
}

public class Test {

	public static void main(String[] args) {  // Starting of JVM
	
		Employee e = new Employee();

		e.getEmpDetails();
	}

}

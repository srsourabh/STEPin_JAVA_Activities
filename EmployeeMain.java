package Activity1;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the Address");
		String address = sc.next();
		System.out.println("enter the Mobile Number");
		String mobile = sc.next();
		
		
		Employee obj = new Employee();
		obj.setName(name);
		obj.setMobile(mobile);
		obj.setAddress(address);
		
		System.out.println("Name: " + obj.getName());
		System.out.println("Mobile: " + obj.getMobile());
		System.out.println("Address: " + obj.getAddress());
		
		
		
	}

}

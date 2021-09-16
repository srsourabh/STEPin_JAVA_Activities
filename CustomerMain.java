package Activity1;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name, Address, mobile: \n");
		
		String details = sc.next();
		
		String[] arrString = details.split(",");
		
		Customer c = new Customer();
		c.setName(arrString[0]);
		System.out.println("name :" + c.getName());
		c.setAddress(arrString[1]);
		System.out.println("Address :" + c.getAddress());
		c.setMobile(arrString[2]);
		System.out.println("Mobile :" + c.getMobile());

		


	}

}

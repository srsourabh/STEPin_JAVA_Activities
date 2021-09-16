package Activity1;

import java.util.Scanner;

public class Employee2Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the Address");
		String address = sc.next();
		System.out.println("enter the Mobile Number");
		String mobile = sc.next();
		
		
		Employee2 obj = new Employee2();
		obj.setName(name);
		obj.setMobile(mobile);
		obj.setAddress(address);
		
		System.out.println("Employee Details");
		System.out.println("Name: " + obj.getName());
		System.out.println("Mobile: " + obj.getMobile());
		System.out.println("Address: " + obj.getAddress());
		
		obj.menu();
		int choice;
		choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Enter new name");
			String newName = sc.next();
			obj.setName(newName);
			obj.menu();
			choice = sc.nextInt();
			if(choice == 4) {
				System.out.println("The Employee Details are");
				System.out.println("Name: " + obj.getName());
				System.out.println("Mobile: " + obj.getMobile());
				System.out.println("Address: " + obj.getAddress());
				
			}
			
			
		case 2:
			System.out.println("Enter new Adress");
			String newAddress = sc.next();
			obj.setAddress(newAddress);
			obj.menu();
			choice = sc.nextInt();
			if(choice == 4) {
				System.out.println("The Employee Details are");
				System.out.println("Name: " + obj.getName());
				System.out.println("Mobile: " + obj.getMobile());
				System.out.println("Address: " + obj.getAddress());
			}
			
			
			
		case 3:
			System.out.println("Enter new Mobile");
			String newMobile = sc.next();
			obj.setMobile(newMobile);
			obj.menu();
			choice = sc.nextInt();
			if(choice == 4) {
				System.out.println("The Employee Details are");
				System.out.println("Name: " + obj.getName());
				System.out.println("Mobile: " + obj.getMobile());
				System.out.println("Address: " + obj.getAddress());
			}
			
			break;
		case 4:
			System.out.println("The Employee Details are");
			System.out.println("Name: " + obj.getName());
			System.out.println("Mobile: " + obj.getMobile());
			System.out.println("Address: " + obj.getAddress());
			break;


		default:
			System.out.println("Invalid Input");
			break;
		}

		
		
		
		
	}

}

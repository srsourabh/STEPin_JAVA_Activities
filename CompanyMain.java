package Activity1;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company name \n");
		String companyName = sc.next();
		
		System.out.println("Enter Employees \n");
		String Employees = sc.next();
		
		System.out.println("Enter Team Lead \n");
		String TeamLead = sc.next();
		
		String[] arr = Employees.split(","); 
		int len = arr.length-1;
		
		Company obj = new Company();
		obj.setName(companyName);
		obj.setEmployees(Employees);
		obj.setTeamlead(arr[len]);
		
		if(TeamLead.contentEquals(arr[len])) {
			System.out.println(obj.getName());
			System.out.println(obj.getEmployees());	
			System.out.println(obj.getTeamlead());
		}else {
			System.out.println("Invalid Input");
		}
		
		
	}

}

package Activity1;

public class Employee2 {
	
	private String name;
	private String address;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void menu() {
		System.out.println("Varify and Update the details /n menu");
		
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information correct/Exit");
		
	}
	
	

}

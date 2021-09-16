package Activity1;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Team Name");
		String teamname = sc.next();
		System.out.println("enter Session");
		String inningsName = sc.next();
		System.out.println("enter Runs");
		int runs = sc.nextInt();
		
		Innings obj = new Innings();
		
		obj.setTeamname(teamname);
		obj.setInningsName(inningsName);
		obj.setRuns(runs);
		
		
		obj.displayInningsDetails();
		
		
		
	}

}

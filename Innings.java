package Activity1;

public class Innings {
	
	private String teamname;
	private String inningsName;
	private int runs;
	
	public void displayInningsDetails() {
		if(this.inningsName.contentEquals("First")) {
			System.out.println("Name: " + this.teamname);
			System.out.println("Scored: " + this.runs);
			int toWin = this.runs;
			toWin++;
			System.out.println("need " + toWin +" to win");
			//System.out.println("Inning Name: " + this.inningsName);
			
		}
		else {
			System.out.println("Name: " + this.teamname);
			System.out.println("Scored: " + this.runs);
			if(this.runs == runs) {
				System.out.println("Match Ended");
			}
		}
		
		
		
		
	}
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getInningsName() {
		return inningsName;
	}
	public void setInningsName(String inningsName) {
		this.inningsName = inningsName;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		if(runs <0) {
			System.out.println("please enter positive integer");
			
		}
		this.runs = runs;
	}
	
	

}

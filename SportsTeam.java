
public abstract class SportsTeam {

	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam() {
		teamName="";
		teamMascot="";
		headCoach="";
		wins=0;
		losses=0;
		
	}// end empty constructor
	
	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName=teamName;
		this.teamMascot=teamMascot;
		this.headCoach=headCoach;
		this.wins=0;
		this.losses=0;
		
	}// end preferred constructor
	
	public double getWinPercentage() {
		
		return wins/(wins+losses);
		
	}// end getWinPercentage method
	
	public abstract double[] getStats();	
	
}//end class


public class BasketballTeam extends SportsTeam{
	
	private static int fieldGoals;
	private static int fieldGoalsAttempted;
	private static int freeThrows;
	private static int freeThrowsAttempted;
	
	public BasketballTeam() {
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0;
		freeThrowsAttempted=0;
		
	}//end empty argument constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		BasketballTeam.fieldGoals=0;
		BasketballTeam.fieldGoalsAttempted=0;
		BasketballTeam.freeThrows=0;
		BasketballTeam.freeThrowsAttempted=0;
		
	}//end preferred constructor
	
	public static double fieldGoalPercentage() {
		
		
		return fieldGoals/fieldGoalsAttempted;
				
		
	}//end fieldGoalPercentage method
	

	public static double freeThrowPercentage() {
		
		return freeThrows/freeThrowsAttempted;
		
	}//end freeThrowPercentage Method
	
	public void getStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		
		super.wins=wins;
		super.losses=losses;
		BasketballTeam.fieldGoals=fieldGoals;
		BasketballTeam.fieldGoalsAttempted=fieldGoalsAttempted;
		BasketballTeam.freeThrows=freeThrows;
		BasketballTeam.freeThrowsAttempted=freeThrowsAttempted;
		
		
	}//end getStats method
	
	public double [] getStats() {
		double[] stats = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
		return stats; 
		
	}//end getStats method

}//end class

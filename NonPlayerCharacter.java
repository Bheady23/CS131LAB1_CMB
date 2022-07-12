import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {
	
	//instance variables
	private boolean active;
	private String intelligenceType;
	
	
	//setters and getters
	public boolean isActive() {
		return active;
	}//end isActive
	
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType
	
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligenceType
	
	//constructors
	
	NonPlayerCharacter() {
		
		super();
		active=false;
		intelligenceType="AVERAGE";
		
	}//end empty constructor
	
	NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super();
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
	}//end preferred constructor
	
	public String reportStructure() {
		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
		
	}//end reportStructuremethod
	
	public String introduce() {
		return "Hello my name is "+getUniqueID();
		
	}// end introduce method
	
	public String exclaim() {
		String[] phrase= {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random number = new Random();
		int i= number.nextInt(5);
		return phrase[i];
		
	}//end exclaim method
	

}//end class

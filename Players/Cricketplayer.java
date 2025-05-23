package Players;

public class Cricketplayer extends Players{  
	int runscored,wicketstaken; 
	float battingavg,bollingavg;
	
	int getRunscored() {
		return runscored;
	}
	void setRunscored(int runscored) {
		this.runscored = runscored;
	}
	int getWicketstaken() {
		return wicketstaken;
	}
	void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	float getBattingavg() {
		return battingavg;
	}
	void setBattingavg(float battingavg) {
		this.battingavg = battingavg;
	}
	float getBollingavg() {
		return bollingavg;
	}
	void setBowlingavg(float bollingavg) {
		this.bollingavg = bollingavg;
	}
	
	Cricketplayer(int jnumber, int age, String position, String name, String team, int runscored, int wicketstaken,float battingavg, float bowlingavg){
		super(jnumber, age, position, name, team); 
		this.runscored = runscored;
		this.wicketstaken = wicketstaken;
		this.battingavg = battingavg;
		this.bollingavg = bowlingavg;
	}  
	
	void Show(){  
		super.Show(); 
		System.out.println("Total Runs:  "+this.getRunscored()); 
		System.out.println("Total Wickets Taken:  "+this.getWicketstaken());
		System.out.println("Batting Avarage:  "+this.getBattingavg()); 
		System.out.println("Batting Avarage:  "+this.getBollingavg()); 

	}	
}

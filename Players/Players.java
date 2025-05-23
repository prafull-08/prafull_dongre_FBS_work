package Players;

public class Players { 
	int Jnumber,Age;
	String name,Team,position;
	int getJnumber() {
		return Jnumber;
	}
	void setJnumber(int jnumber) {
		Jnumber = jnumber;
	}
	int getAge() {
		return Age;
	}
	void setAge(int age) {
		Age = age;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return Team;
	}
	void setTeam(String team) {
		Team = team;
	}
	Players(int jnumber, int age, String position, String name, String team){
		Jnumber = jnumber;
		Age = age;
		this.position = position;
		this.name = name;
		Team = team;
	}
	 
	public Players() {
		// TODO Auto-generated constructor stub
	}
	
	void Show(){ 
		System.out.println("Name:  "+this.getName()); 
		System.out.println("Joursy Number:  "+this.getJnumber());
		System.out.println("Age:  "+this.getAge());
		System.out.println("Position in team:  "+this.getPosition());
		System.out.println("Team:  "+this.getTeam());
	}
	
} 



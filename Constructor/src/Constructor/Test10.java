package Constructor;

class Time{ 
	int Hour,Min,Sec;

	Time(int hr, int min, int sec) {
		this.Hour=hr; 
		this.Min=min; 
		this.Sec=sec;
	}

	Time() {
		this.Hour=8; 
		this.Min=35;
		this.Sec=50;
	}

	int getHour() {
		return Hour;
	}

	void setHour(int hour) {
		Hour = hour;
	}

	int getMin() {
		return Min;
	}

	void setMin(int min) {
		Min = min;
	}

	int getSec() {
		return Sec;
	}

	void setSec(int sec) {
		Sec = sec;
	} 
	
	
	void display() { 
		System.out.printf("\nStarting Time:%d:%d:%d\n",this.Hour,this.Min,this.Sec);
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		Time t1 = new Time(5,30,45); 
		t1.display(); 
		
		t1.setHour(6);
		System.out.println("Ending Time: "+t1.Hour+":"+t1.Min+":"+t1.Sec); 

		
		Time t2 = new Time(); 
		t2.display(); 
		
		t2.setHour(9); 
		System.out.println("Ending Time: "+t2.Hour+":"+t2.Min+":"+t2.Sec); 


	}

}

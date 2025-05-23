package getterSetter;



class Time{ 
	int hour,min,sec;

	void setHour(int hour) {
		this.hour = hour;
	}

	void setMin(int min) {
		this.min = min;
	}

	void setSec(int sec) {
		this.sec = sec;
	} 
	
	
	int getMin() { 
		return min;
	}

	int getHour() {
		return hour;
	}

	int getSec() {
		return sec;
	}
	

}


public class Test1 {

	public static void main(String[] args) {
		Time t1 = new Time(); 
		t1.setHour(3); 
		t1.setMin(30); 
		t1.setSec(45);
		//t1.display();

		
		System.out.println("Time: "+t1.hour+":"+t1.min+":"+t1.sec); 
	}

}

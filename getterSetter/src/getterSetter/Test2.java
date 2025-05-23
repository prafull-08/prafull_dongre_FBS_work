package getterSetter;



class Date{ 
	
	int day,month,year;
	String dow;

	void setDay(int day) {
		this.day = day;
	}

	void setMonth(int month) {
		this.month = month;
	}

	void setYear(int year) {
		this.year = year;
	} 
	
	String getDow() {
		return dow;
	}

	void setDow(String dow) {
		this.dow = dow;
	}

	int getDay() {
		return day;
	}

	int getMonth() {
		return month;
	}

	int getYear() {
		return year;
	}

	void display() { 
		System.out.printf("Date: %d/%d/%d",this.day,this.month,this.year); 
		System.out.println(" Day of week is: "+this.dow);
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		Date d1 = new Date(); 
		d1.setDay(1); 
		d1.setMonth(6); 
		d1.setYear(2002); 
		d1.setDow("saturday");
		d1.display(); 
		
		Date d2 =new Date(); 
		d2.setDay(5); 
		d2.setMonth(12);
		d2.display();
		
		

	}

}

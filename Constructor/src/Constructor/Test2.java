package Constructor;


class Date{ 
	int day,month,year;
	String Dow;
	
	
	
	
	Date() {
		this.day=7;
		this.month=3;
		this.year=2025; 
		this.Dow=("Monday");
	}
	
	
	
	
	Date(int i, int j, int k, String string) {
		this.day=i; 
		this.month=j; 
		this.year=k; 
		this.Dow=string;
	}




	int getDay() {
		return day;
	}
	void setDay(int day) {
		this.day = day;
	}
	int getMonth() {
		return month;
	}
	void setMonth(int month) {
		this.month = month;
	}
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	String getDow() {
		return Dow;
	}
	void setDow(String dow) {
		Dow = dow;
	} 

	void display() { 
		System.out.printf("\nDate: %d/%d/%d Day:%s",this.day,this.month,this.year,this.Dow);
	}
	
	
	
}


public class Test2 {

	public static void main(String[] args) {
		Date d1 = new Date(); 
		d1.display();
		d1.setDay(15); 
		d1.setDow("Tuesday");
		d1.display();
		
		
		
		Date d2 = new Date(1,6,2002,"Saturday");
		d2.display();
	

	}

}

package Constructor;


class Distance{ 
	int feet,inch;
	
	
	Distance(int i, int j) {
		this.feet=i; 
		this.inch=j;
	}


	Distance() {
		this.feet=7; 
		this.inch=4;
	}


	int getFeet() {
		return feet;
	}


	void setFeet(int feet) {
		this.feet = feet;
	}


	int getInch() {
		return inch;
	}


	void setInch(int inch) {
		this.inch = inch;
	}


	void display() {
		System.out.printf("Distance: %d.%d\n",this.feet,this.inch); 
	}
}

public class Test7 {

	public static void main(String[] args) {
		Distance d1 = new Distance(5,6); 
		d1.display(); 
		
		Distance d2 = new Distance();
		d2.display();
	}

}

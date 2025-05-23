package getterSetter;

class Distance{ 
	int feet,inch;
	
	
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

public class Test8 {

	public static void main(String[] args) {
		Distance d1 = new Distance();
		d1.setFeet(5); 
		d1.setInch(6); 
		
		d1.display();

	}

}

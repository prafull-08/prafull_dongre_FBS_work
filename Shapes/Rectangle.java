package Shapes;

public class Rectangle extends Shape {
	float length,width;

	float getLength() {
		return length;
	}

	void setLength(float length) {
		this.length = length;
	}

	float getWidth() {
		return width;
	}

	void setWidth(float width) {
		this.width = width;
	}

	Rectangle() {
		super(); 
		this.length=3.2f; 
		this.width=1.2f; 
		this.area=this.getLength()*this.getWidth(); 
	}   
	
	void display() { 
		super.display(); 
		System.out.println("With given Rectangle's length and width"+this.getLength()+"="+this.getWidth()+"+"+this.getArea());
	}
	
	 
	
	
}

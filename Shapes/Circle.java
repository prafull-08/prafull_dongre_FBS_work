package Shapes;

public class Circle extends Shape {
	float radius;

	float getRadius() {
		return radius;
	}

	void setRadius(float radius) {
		this.radius = radius;
	}

	Circle() {
		//super(); 
		this.radius=2.3f;
		this.area=3.14f*(this.getRadius()*this.getRadius());
	}  
	
	void display() { 
		super.display(); 
		System.out.println("With given Circle's Radius: 3.14*("+this.getRadius()+"*"+this.getRadius()+")="+this.getArea());
	}
	
}

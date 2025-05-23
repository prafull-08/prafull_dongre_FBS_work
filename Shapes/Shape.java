package Shapes;

public class Shape {
	float area;

	float getArea() {
		return area;
	}

	void setArea(float area) {
		this.area = area;
	}

	Shape(){
		this.area = 0.0f;
	}  
	
	void display() { 
		System.out.println("Area:"+area);
	}
	
}

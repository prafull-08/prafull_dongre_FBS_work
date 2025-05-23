
public class Shape { 
	double area;
	void Calarea(Triangle t) {  
		this.area=0.5f*(t.getHeight()*t.getBase()); 
		System.out.println("Area of Triangle is:"+this.area);
	} 
	
	void Calarea(Rectangel r) {
		this.area=r.getLength()*r.getWidth(); 
		System.out.println("Area of Rectangle: "+this.area);
	} 
	
	void Calarea(Circle c) { 
		this.area=3.14*(c.getRadius()*c.getRadius()); 
		System.out.println("Area Of circle is:"+this.area);
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}

	public void display() {
		// TODO Auto-generated method stub
		
	} 
	 

	



}

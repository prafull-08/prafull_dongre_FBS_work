package Shapes;

class Triangle extends Shape{ 
	float base,height;

	float getBase() {
		return base;
	}

	void setBase(float base) {
		this.base = base;
	}

	float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}

	Triangle(){
		this.base=5.2f;  
		this.height=2.3f; 
		this.area=0.5f*(this.base*this.height); 
	}  

	void display() { 
		super.display(); 
		System.out.println("With given Triangle's Base and Height: 0.5*"+this.getBase()+"*"+this.getHeight()+"="+this.area);
	}
	

}

package getterSetter;


class Complex{ 
	int real; 
	int img; 
	
	
	
	int getReal() {
		return real;
	}



	void setReal(int real) {
		this.real = real;
	}



	int getImg() {
		return img;
	}



	void setImg(int img) {
		this.img = img;
	}



	void display() { 
		System.out.printf("Complex number: %d+%di \n",this.real,this.img);
	}
}

public class Test9 {

	public static void main(String[] args) {
		Complex c1 = new Complex(); 
		c1.setReal(3); 
		c1.setImg(5);
		c1.display();

	}

}

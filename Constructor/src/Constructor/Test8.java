package Constructor;



class Complex{ 
	int real; 
	int img; 
	char c;
	
	
	
	public Complex(int n1, int n2, char c) {
		this.real=n1; 
		this.img=n2; 
		this.c=c;
	}



	Complex() {
		this.real=7; 
		this.img=2; 
		this.c='j';
	}



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
		System.out.printf("Complex number: %d+%d%c \n",this.real,this.img,this.c);
	}
}

public class Test8 {

	public static void main(String[] args) {
		Complex c1 = new Complex(3,5,'i'); 
		c1.display();
		
		Complex c2 = new Complex(); 
		c2.display();

	}

}

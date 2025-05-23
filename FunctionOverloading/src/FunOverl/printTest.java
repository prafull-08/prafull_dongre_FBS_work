package FunOverl; 


class Printer{ 
	
	void print(String s) {
		System.out.println(s);
	}  
	
	void print(int a) { 
		System.out.println(a);
	} 
	
	void print(double d) { 
		System.out.println(d);
	} 
	
	void print(char c) { 
		System.out.println(c);
	}
}

public class printTest {

	public static void main(String[] args) {
		Printer p1 = new Printer();  
		p1.print("Prafull");
		p1.print(10);
		p1.print('P');
		p1.print(20.5);
		

	}

}

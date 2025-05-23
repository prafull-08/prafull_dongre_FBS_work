package FunOverl;


class Calculator{ 
	int a,b,res; 
	double x,y,res1;


	void add(int i,int j) {
		this.a=i;  
		this.b=j; 
		this.res=i+j; 
		System.out.println("Answer of function 1="+res);
		
	}


	void add(double d, double e) {
		this.x=d;  
		this.y=e; 
		this.res1=x+y;
		System.out.println("Answer of function 2="+res1);
	}  
	
	void add(int a,double x) { 
		this.a=a; 
		this.x=x; 
		this.res1=a+x;
		System.out.println("Answer of function 3="+res1);
	} 
	
	void add(double y,int b) { 
		this.y=y; 
		this.b=b; 
		this.res1=y+b;
		System.out.println("Answer of function 4="+res1);
	} 
	
	
	
	 
	//Substraction 
	
	void sub(int i,int j) {
		this.a=i;  
		this.b=j; 
		this.res=i-j;  
		System.out.println("Answer of function 1="+res);
		
	}


	void sub(double d, double e) {
		this.x=d;  
		this.y=e; 
		this.res1=x-y;
		System.out.println("Answer of function 2="+res1);
	}  
	
	void sub(int a,double x) { 
		this.a=a; 
		this.x=x; 
		this.res1=a-x;
		System.out.println("Answer of function 3="+res1);
	} 
	
	void sub(double y,int b) { 
		this.y=y; 
		this.b=b; 
		this.res1=y-b;
		System.out.println("Answer of function 4="+res1);
	} 
	
	
	
	
	//Multiplication 
	
	void Mult(int i,int j) {
		this.a=i;  
		this.b=j; 
		this.res=i*j;  
		System.out.println("Answer of function 1="+res);
		
	}


	void Mult(double d, double e) {
		this.x=d;  
		this.y=e; 
		this.res1=x*y;
		System.out.println("Answer of function 2="+res1);
	}  
	
	void Mult(int a,double x) { 
		this.a=a; 
		this.x=x; 
		this.res1=a*x;
		System.out.println("Answer of function 3="+res1);
	} 
	
	void Mult(double y,int b) { 
		this.y=y; 
		this.b=b; 
		this.res1=y*b;
		System.out.println("Answer of function 4="+res1);
	}
	
	
	
	
	
	
	//Multiplication 
	
	void Div(int i,int j) {
		this.a=i;  
		this.b=j; 
		this.res=i/j;  
		System.out.println("Answer of function 1="+res);
		
	}


	void Div(double d, double e) {
		this.x=d;  
		this.y=e; 
		this.res1=x/y;
		System.out.println("Answer of function 2="+res1);
	}  
	
	void Div(int a,double x) { 
		this.a=a; 
		this.x=x; 
		this.res1=a/x;
		System.out.println("Answer of function 3="+res1);
	} 
	
	void Div(double y,int b) { 
		this.y=y; 
		this.b=b; 
		this.res1=y/b;
		System.out.println("Answer of function 4="+res1);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		 
		Calculator c1 = new Calculator();  
		
		int a=10,b=20; 
		double x=2.3,y=7.7;
		
		System.out.println("Addtion:");
		c1.add(a,b); 
		c1.add(x,y); 
		c1.add(a,x); 
		c1.add(y,b); 
		
		
		System.out.println("\n\nSubstraction:");
		c1.sub(a,b); 
		c1.sub(x,y); 
		c1.sub(a,x); 
		c1.sub(y,b); 
		
	
		System.out.println("\n\nMultiplication:");
		c1.Mult(a,b); 
		c1.Mult(x,y); 
		c1.Mult(a,x); 
		c1.Mult(y,b); 
		
		
		System.out.println("\n\nDivision:");
		c1.Div(a=10,b=2); 
		c1.Div(x,y); 
		c1.Div(a,x); 
		c1.Div(y,b);
	}

}

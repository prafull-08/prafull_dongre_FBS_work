package DefaultConstructor; 

class demo { 
	demo(){ 
		System.out.println("Default");
	}  
	
	demo(int a){ 
		System.out.println("Parameterized");
	}


	
} 

public class DefaultConstructor {

	public static void main(String[] args) {
		demo d = new demo(5); 
		demo d1 = new demo();

	}

}

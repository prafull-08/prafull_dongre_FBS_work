package Vehicle;

public class Vehicle {
	void display() { 
		System.out.println("This is vehicle"); 
	}  
	 
	void run() { 
		System.out.println("Running on road");
	}  
	
	void fuel() { 
		System.out.println("Fuels type: ");
	} 
	
	void Transport() { 
		System.out.println("Public Transport");
	}
	

} 

class Car extends Vehicle{ 
	void display() { 
		super.display();   
		System.out.println("we called as a Car");
	} 
	
	void run() { 
		super.run();
		System.out.println("With 4 Wheels");
	} 
	
	void fuel() { 
		super.fuel(); 
		System.out.println("-Diesel\n-Petrol"); 
	
	}
} 


class Bike extends Vehicle { 
	void display() { 
		super.display(); 
		System.out.println("We Called as Bike");
	} 
	
	void run() { 
		super.run(); 
		System.out.println("With 2 Wheels ");
	} 
	
	void fuel() { 
		super.fuel(); 
		System.out.println("-Petrol");
	} 
	

	
} 


class Bus extends Vehicle { 
	void display() { 
		super.display();  
		super.Transport();
		System.out.println("We called as Bus");
	} 
	
	void run() { 
		super.run(); 
		System.out.println("with double 4 Wheels");
	} 
	
	void fuel() { 
		super.fuel(); 
		System.out.println("-petrol\n-Diesel");
	}
}

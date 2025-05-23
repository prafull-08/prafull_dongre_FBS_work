package Vehicle;

public class Main {

	public static void main(String[] args) {
		Car c = new Car(); 
		c.display(); 
		c.run(); 
		c.fuel(); 
		System.out.println("-----------------------------------------------------------------");
		
		
		Bike b = new Bike(); 
		b.display(); 
		b.run();
		b.fuel(); 
		
		System.out.println("-----------------------------------------------------------------");
 
		Bus bs = new Bus(); 
		bs.display(); 
		bs.run(); 
		bs.fuel();
		
	}

}

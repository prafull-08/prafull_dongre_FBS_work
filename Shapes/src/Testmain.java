public class Testmain {

	public static void main(String[] args) {
		Shape s1 = new Shape(); 
		Triangle t = new Triangle(5f,2f); 
		Rectangel r = new Rectangel(3.2f,4.1f); 
		Circle c = new Circle(2.3f); 
		 
//.display();
		s1.Calarea(t); 
		s1.Calarea(r);
		s1.Calarea(c); 
		//t.display();

	}

}

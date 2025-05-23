package Constructor;



class Student{ 
	int rollno,marks; 
	String name;
	Student(int i, int j, String string) {
		this.rollno=i; 
		this.marks=j; 
		this.name=string;
	}

	
	Student() {
		this.marks=90;
		this.rollno=20;
		this.name="White"; 
	}





	int getRollno() {
		return rollno;
	}
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	int getMarks() {
		return marks;
	}
	void setMarks(int marks) {
		this.marks = marks;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
	
	public void display() {
		System.out.println("\nStudent Details: \n-Rollno:"+this.rollno+"\n-Name:"+this.name+"\n-Marks:"+this.marks);
	}
	
	
	
}
public class Test3 {

	public static void main(String[] args) {
		Student s1 = new Student(16,85,"Walter");
		s1.display();
		
		
		
		Student s2 = new Student(); 
		s2.display(); 
		
		s2.setName("Prafull");
		s2.display();
		

	}

}

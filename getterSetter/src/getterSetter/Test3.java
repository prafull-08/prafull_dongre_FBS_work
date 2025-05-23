package getterSetter;



class Student{ 
	int rollno,marks;
	String name;
	int getRollno() {
		return rollno;
	}
	void setRollno(int rolono) {
		this.rollno = rolono;
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
	
}
public class Test3 {

	public static void main(String[] args) {
		Student s1 =new Student(); 
		s1.setRollno(16);  
		s1.setName("Prafull");
		s1.setMarks(85); 
		
		System.out.println("Student Details: \n-Rollno:"+s1.rollno+"\n-Name:"+s1.name+"\n-Marks:"+s1.marks);
		

	}

}

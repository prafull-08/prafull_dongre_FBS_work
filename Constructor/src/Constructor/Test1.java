package Constructor;



class Employee{ 
	int id; 
	int salary; 
	String name; 
	
	

	Employee() {
		this.id=100; 
		this.salary=45000;
		this.name="Prafull";
	}
	
	

	Employee(int i, String string, int j) {
		this.id=i; 
		this.name=string;
		this.salary = j;
	}



	int getId() {
		return id;
	}



	void setId(int id) {
		this.id = id;
	}



	int getSalary() {
		return salary;
	}



	void setSalary(int salary) {
		this.salary = salary;
	}



	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}
	
	public void display() { 
		System.out.printf("\nEmployee Details: \n-ID=%d \n-Name:%s \n-Salary:%d",this.id,this.name,this.salary);
	} 
}



public class Test1 {

	public static void main(String[] args) { 
		Employee e1;//reference
		e1=new Employee();//object created , constructor called here 
		e1.display(); 
		
		
		Employee e2 = new Employee(102,"Om",2000); 
		e2.display();
		}
	}
		




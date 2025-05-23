package getterSetter; 


class Employee{ 
	int id;
	String name; 
	double salary;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Test4 {

	public static void main(String[] args) {
		Employee e = new Employee(); 
		e.setId(101); 
		e.setName("Prafull");
		e.setSalary(35450.65);
		
		System.out.println("Employee Details: \n-ID:"+e.id+"\n-Name:"+e.name+"\n-Salary:"+e.salary);

	}

}

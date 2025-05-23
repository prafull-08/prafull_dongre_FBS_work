package getterSetter;


class Admin{ 
	int id,salary; 
	String name; 
	double allowance;
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
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	void display() { 
		System.out.printf("Admin Details: \n-ID:%d\n-Name:%s\n-Salary:%d\n-Allowance:%f",this.id,this.name,this.salary,this.allowance);
	}
}

public class Test5 {

	public static void main(String[] args) {
		Admin ad = new Admin(); 
		ad.setId(201); 
		ad.setName("Ajay"); 
		ad.setAllowance(1000.50); 
		ad.display();

	}

}

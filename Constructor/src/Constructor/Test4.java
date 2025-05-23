package Constructor;


class Admin{ 
	int id; 
	String name; 
	double salary,allowance;
	
	
	
	
	Admin() {
		this.id=101; 
		this.name="Raj"; 
		this.salary=25000.25;
		this.allowance=1500.75;
	}
	
	public Admin(int i, String string, double d, double e) {
		this.id=i; 
		this.name=string; 
		this.salary=d; 
		this.allowance=e;
	}
	
	
	
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
	
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	public void display() {
		System.out.printf("\nAdmin Details: \n-ID:%d \n-Name:%s \n-Salary:%f \n-Allowance:%f\n",this.id,this.name,this.salary,this.allowance);
	} 
	
	
	
}

public class Test4 {

	public static void main(String[] args) {
		
		Admin a1 = new Admin(); 
		a1.display();
		
		Admin a2 = new Admin(102,"Karan",35000.85,2000.25);
		a2.display();
		
	}

}

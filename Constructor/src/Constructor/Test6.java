package Constructor; 

class SalesManager{ 
	int id,salary,incentive,target;
	String name;
	
	
	
	
	SalesManager() {
		this.id=1001; 
		this.salary=35000; 
		this.incentive=100; 
		this.target=15; 
		this.name="Gayle";
	}
	
	SalesManager(int i, String string, int j, int k, int l) {
		this.id=i; 
		this.name=string; 
		this.salary=j; 
		this.incentive=k; 
		this.target=l;
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
	int getIncentive() {
		return incentive;
	}
	void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	void display() { 
		System.out.printf("\nSales Manager Details: \n-ID:%d\n-Name:%s\n-Salary:%d\n-Incentive:%d\n-Target:%d\n",this.id,this.name,this.salary,this.incentive,this.target);
	}
}

public class Test6 {

	public static void main(String[] args) {
		SalesManager sm1 = new SalesManager(); 
		sm1.display(); 
		
		SalesManager sm2 = new SalesManager(1002,"Om",50000,500,20); 
		sm2.display();

	}

}

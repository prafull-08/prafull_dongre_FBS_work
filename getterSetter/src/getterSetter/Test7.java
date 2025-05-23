package getterSetter;


class SalesManager{ 
	int id,salary,incentive,target;
	String name;
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
		System.out.printf("Sales Manager Details: \n-ID:%d\n-Name:%s\n-Salary:%d\n-Incentive:%d\n-Target:%d",this.id,this.name,this.salary,this.incentive,this.target);
	}
}

public class Test7 {

	public static void main(String[] args) {
		SalesManager sm = new SalesManager(); 
		sm.setId(401); 
		sm.setSalary(25000);
		sm.setIncentive(500);
		sm.setName("Sam"); 
		sm.setTarget(10);
		
		sm.display();

	}

}

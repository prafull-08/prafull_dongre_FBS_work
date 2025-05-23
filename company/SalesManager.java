public class SalesManager extends Employee{
	int target; 
	float incentive;
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}
	float getIncentive() {
		return incentive;
	}
	void setIncentive(float incentive) {
		this.incentive = incentive;
	}
	
	

	SalesManager() {
		super();
		this.target = 10;
		this.incentive = 1200;
	}  
	
	public SalesManager(int Eid, String Ename, int Esalary, int k, float l) {
		super(Eid,Ename,Esalary);  
		this.target=5; 
		this.incentive=200;
	} 
	
	void display() {  
		super.display();
		System.out.println("-Target: "+this.getTarget()); 
		System.out.println("-Incentive: "+this.getIncentive());
	}
	void Calsalary() {  
		this.Totsalary = this.getEsalary() + this.getIncentive();
		System.out.println("-Total Salary:"+this.Totsalary);
	}
	
}

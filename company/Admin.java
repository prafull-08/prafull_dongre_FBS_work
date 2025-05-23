
public class Admin extends Employee {
	float Allowance,Totsalary;

	Admin(int eid, String ename, float esalary, float allowance) {
		super(eid, ename, esalary);
		Allowance = allowance;
	} 
	
	Admin(){ 
		super();  
		this.Allowance = 500;
	}  
	
	
	
	float getAllowance() {
		return Allowance;
	}

	void setAllowance(float allowance) {
		Allowance = allowance;
	}

	void display() { 
		super.display(); 
		System.out.println("-Allowance:"+this.getAllowance()); 
	}
	 
	void Calsalary() { 
		this.Totsalary = this.getEsalary()+this.getAllowance(); 
		System.out.println("-Total salary: "+this.Totsalary);
	}
}

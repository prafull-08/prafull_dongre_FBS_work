public class HR extends Employee{
 
	float commision,Totsalary; 
	
	HR(int eid, String ename, float esalary,float commission) {
		super(eid,ename,esalary);    
		this.commision=commission; 
		
	} 
	
	HR(){ 
		super(); 
		this.commision=1050;
	}
	float getCommision() {
		return commision;
	}
	void setCommision(float commmision) {
		this.commision = commmision;
	}  
	


	void display() { 
		super.display(); 
		System.out.println("-Commission: "+this.getCommision());
	} 
	 
	void Calsalary() {  
		this.Totsalary = this.getEsalary() + this.getCommision();
		System.out.println("-Total Salary:"+this.Totsalary);
	}
	
	
	
}
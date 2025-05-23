class Employee{ 
	int Eid; 
	String Ename; 
	float Esalary,Totsalary;
	Employee(int eid, String ename, float esalary) {
		Eid = eid;
		Ename = ename;
		Esalary = esalary;
	}
	Employee() {
		this.Eid=102; 
		this.Ename="Ajay"; 
		this.Esalary=300000f;
	}
	int getEid() {
		return Eid;
	}
	void setEid(int eid) {
		Eid = eid;
	}
	String getEname() {
		return Ename;
	}
	void setEname(String ename) {
		Ename = ename;
	}
	float getEsalary() {
		return Esalary;
	}
	void setEsalary(float esalary) {
		Esalary = esalary;
	}   
	
	float getTotsalary() {
		return Totsalary;
	}

	void setTotsalary(float totsalary) {
		Totsalary = totsalary;
	}
	
	void display() { 
		System.out.println("\nEmployee Details \n-Id:"+this.getEid()+"\n-name:"+this.getEname()+"\n-Salary: "+this.Esalary);
	}  
	
	
	
} 

public class MainEmployee {

	public static void main(String[] args) {
		//Employee e1 = new Employee(101,"Ranjit",50000);  
		Employee e2 = new Employee();
		
		HR h1 = new HR(101,"Ranjit",50000,1000);
		h1.display(); 
		h1.Calsalary(); 
		
		Admin a1 = new Admin(); 
		a1.display();
		a1.Calsalary(); 
		
		SalesManager sm1 = new SalesManager(301,"Semon",25000,5,200f); 
		sm1.display(); 
		sm1.Calsalary();


	}

}

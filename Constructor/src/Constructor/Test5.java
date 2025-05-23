package Constructor;


class HR{ 
	int ID,commission;
	double salary;
	String name;
	
	
	HR() {
		this.ID=105; 
		this.salary=45000.85;
		this.commission=500; 
		this.name="Ajay";
	}
	
	
	public HR(int i, String string, double d, int j) {
		this.ID=i; 
		this.name=string;
		this.salary=d; 
		this.commission=j;
	}


	int getID() {
		return ID;
	}
	void setID(int iD) {
		ID = iD;
	}
	int getCommission() {
		return commission;
	}
	void setCommission(int commission) {
		this.commission = commission;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(float salary) {
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
	void display() { 
		System.out.printf("\nHR Details: \n-ID:%d\n-Name:%s\n-Salary:%f\n-Commission:%d\n",this.ID,this.name,this.salary,this.commission);

	}
	
	
}

public class Test5 {

	public static void main(String[] args) {
		HR h1 = new HR(); 
		h1.display(); 
		
		HR h2 = new HR(205,"Sam",35000.2,250); 
		h2.display();

	}

}

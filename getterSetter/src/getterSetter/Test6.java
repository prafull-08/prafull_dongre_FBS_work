package getterSetter;


class HR{  
	int ID,salary,commission;
	String name;
	int getID() {
		return ID;
	}
	void setID(int iD) {
		ID = iD;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	int getCommission() {
		return commission;
	}
	void setCommission(int commission) {
		this.commission = commission;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	} 
	
	void display() { 
		System.out.printf("HR Details: \n-ID:%d\n-Name:%s\n-Salary:%d\n-Commission:%d",this.ID,this.name,this.salary,this.commission);
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		HR h = new HR(); 
		h.setID(301); 
		h.setSalary(35000);
		h.setCommission(1000);
		h.setName("Rasika"); 
		h.display();

	}

}

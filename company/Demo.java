class Student{ 
	int fbid,distance; 
	String name;
	
	int getFbid() {
		return fbid;
	}
	void setFbid(int fbid) {
		this.fbid = fbid;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}  
	
	
	Student(int a,String s, int b){  
		System.out.println("Student para Constructor");
		this.fbid=a; 
		this.name=s; 
		this.distance=b;
	} 
	
	Student(){  
		System.out.println("Student default Constructor");
		this.fbid=201; 
		this.name="Om"; 
		this.distance=50;
	} 
	
	
	void display() { 
		System.out.println("Id: "+this.fbid+"\nName: "+this.name+"\nDistance"+this.distance);
	}
	
} //class Student ends here  



class Plstudent extends Student{ // step 1
	String Company,Desigantion;	

	Plstudent() {  
		super();//step 2
		System.out.println("Placed Student Default Constructor");
		this.Company="Not Assigned"; 
		this.Desigantion="xyz";
	}  
	
	Plstudent(int fbid, String name, int distance,String c, String d) { 
		super(fbid,name,distance); //step 3
		System.out.println("Placed Student para Constructor");
		this.Company=c; 
		this.Desigantion=d;
	} //para constructor ends here
	
	
	
	String getCompany() {
		return Company;
	}


	void setCompany(String company) {
		Company = company;
	}


	String getDesigantion() {
		return Desigantion;
	}


	void setDesigantion(String desigantion) {
		Desigantion = desigantion;
	}


	void display() { 
		super.display();//step 4
		System.out.println(Company+"\nDesignation:"+this.Desigantion);
	}
	
}



public class Demo {

	public static void main(String[] args) {		
		Plstudent pl2 = new Plstudent(101,"Not Given",50,"Cdot","Opener"); 
		pl2.display(); 
		//Plstudent pl1 = new Plstudent(); 
		//pl1.display(); 
		
		Student s1 = new Student(); 
		s1.display();
		
	} 
	
	

}

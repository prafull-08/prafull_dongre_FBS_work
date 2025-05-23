package Constructor;


class Product{ 
	int id,price,quantity; 
	String name;
	
	Product(){ 
		this.id=1005; 
		this.price=1000; 
		this.quantity=5; 
		this.name="Pendrive";
	}
	Product(int i, int j, String string, int k) {
		this.id=i; 
		this.price=j; 
		this.name=string; 
		this.quantity=k;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	} 
	 
	
	void display() { 
		System.out.printf("\nProduct Details: \n-ID:%d \n-Price:%d \n-Name:%s \n-Quantity:%d\n",this.id,this.price,this.name,this.quantity);;
	}
}

public class Test9 {

	public static void main(String[] args) {
		
		Product p1 = new Product();		
		p1.display(); 
		
		Product p2 = new Product(1010,2000,"Earphones",10); 
		p2.display();

	}

}


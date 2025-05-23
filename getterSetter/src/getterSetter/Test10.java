package getterSetter;


class Product{ 
	int id,price,quantity; 
	String name;
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
		System.out.printf("Product Details: \n-ID:%d \n-Price:%d \n-Name:%s \n-Quantity:%d",this.id,this.price,this.name,this.quantity);;
	}
}

public class Test10 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setId(501);
		p1.setPrice(1050); 
		p1.setName("Charger");
		p1.setQuantity(2);
		
		p1.display();

	}

}

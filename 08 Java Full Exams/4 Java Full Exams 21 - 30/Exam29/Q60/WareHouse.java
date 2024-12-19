public class WareHouse {
	public static void main(String[] args) {
		Product p1 = new Product(10);
		Product p2 = new Product(10);
		Product p3 = new Product(20);
		System.out.print(p1.equals(p2)+"");
		System.out.print(p1.equals(p3));
	}
} 

class Product {
	private int id;
	public Product (int id) {
		this.id = id;
	}
	public int hashCode() {
		return id + 42;
	}
public boolean equals (Object obj) {
	return (this == obj) ? true : super.equals(obj);
	}
}


//What is the result?
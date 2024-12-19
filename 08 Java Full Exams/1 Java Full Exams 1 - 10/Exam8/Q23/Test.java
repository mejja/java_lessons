public class Test {
	public void updatePrice(Product product) {
		if (product != null) {
			product.setPrice(product.getPrice() * 10.0);
		}
	}
	public static void main(String[] args) {
		Product p1 = new Product(100);
		Product p2 = null;
		Test t = new Test();
		t.updatePrice(p1);
		t.updatePrice(p2);
		System.out.println(p1.getPrice());
	}
}

class Product {
	private double price;

	public Product(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

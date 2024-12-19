public class Test {
	public void updatePrice(Product product, double price) {
		if (product == null) {
		System.out.println("Product is null");
			return;
		}
		
		product.setPrice(product.getPrice() + price);
	}
	public void updatePrice(Product product) {
		if (product == null) {
		System.out.println("Product is null");
			return;
		}
		product.setPrice(product.getPrice() + price * 2);
	}
	public static void main(String[] args) {
		Product product = new Product(100);
		Test t = new Test();
		t.updatePrice(product, 50);
		t.updatePrice(product, 25.5);
		System.out.println((product.getPrice()));
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

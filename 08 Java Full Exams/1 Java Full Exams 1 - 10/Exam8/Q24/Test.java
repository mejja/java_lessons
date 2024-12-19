public class Test {
	public static void main(String[] args) {
		Product p1 = new Product(5);
		System.out.println(p1.getPriceWithTax());
		Product.setTaxRate(10);
		Product p2 = new Product(100);
		System.out.println(p2.getPriceWithTax());
	}
}
class Product {
	private static double taxRate = 5;
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
	public static void setTaxRate(double rate) {
		taxRate = rate;
	}
	public double getPriceWithTax() {
		return price * (1 + taxRate);
	}
}

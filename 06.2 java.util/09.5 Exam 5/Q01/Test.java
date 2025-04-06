import java.time.LocalDate;
import java.time.Month;

public class Test {
	public static void main(String [] args) {
		LocalDate ocpCouponPurchaseDate = LocalDate.of(2018, 3, 1);
		System.out.println("Coupon expiry date: "+ ocpCouponPurchaseDate.plusDays(10));
	}
}
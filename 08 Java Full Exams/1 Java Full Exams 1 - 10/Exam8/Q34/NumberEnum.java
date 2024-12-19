public class NumberEnum {
	private static final NumberEnum ZERO_INSTANCE = new NumberEnum(0);
	private int num;

	private NumberEnum(int num) { this.num = num; }

	public static NumberEnum of(int num) {
		return num == 0 ? ZERO_INSTANCE : new NumberEnum(num);
	}
	@Override
	public String toString() {
		return num == 0 ? "Zero" : String.valueOf(num);
	}
	public static void main(String[] args) {
		NumberEnum first = NumberEnum.of(0);
		NumberEnum second = NumberEnum.of(2);
		System.out.println(second + " " + first);
	}
}
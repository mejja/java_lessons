class WaterTank {
	private String brand;
	private boolean empty;

	public static void main(String[] args) {
		WaterTank wb = new WaterTank();
		System.out.print("Empty ="+ wb.empty); // prints false
		System.out.print(", Brand =" + wb.brand); // prints null
	}
}
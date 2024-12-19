public class Garden {
	public static void main(String[] args) {
		Embryophyta e = new Embryophyta();
		Embryophyta c = new Carrot();
		System.out.print(e.growthDirection() + growthDirection());
	}
}
class Plant {
	abstract String growthDirection();
}

class Embryophyta extends Plant {
	String growthDirection() { return "Up";}
}

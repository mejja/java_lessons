class Box {
	int value = 2;
	Box pointer;
	public Box(){
	}
	public Box(int val) {
		this.value = val;
		this.pointer = new Box();
	}
	public static void main(String[] args) {
		final Box x = new Box(7);
		Box y = new Box(14);
		x.pointer = y;
		y = changeIt(x, y);
		System.out.println(x.pointer.value + " " + y.pointer.value);
	}
	public static Box changeIt(final Box a, final Box b) {
		a.pointer = b.pointer;
		return a;
	}
}
class Container {
	int number = 3;
	Container next;
	public Container(){
	
	}
	public Container(int num) {
		this.number = num;
		this.next = new Container();
	}
	public static void main(String[] args) {
		final Container m = new Container(6);
		Container n = new Container(12);
		m.next = n;
		n = updateIt(m, n);
		System.out.println(m.next.number +" "+ n.next.number);
	}
	public static Container updateIt(final Container a, final Container b) {
		a.next = b.next;
		return a;
	}
}
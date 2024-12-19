class A{
	int i;
	public A(int x) { this.i = x; }
}
class B extends A{
	int j;
	public B(int x, int y) { super(x); this.j = y; }
}
class Three {
	public static void main(String[] args) {
	A ab = new AB();
	}
}
class A {
A (int x)
{ System.out.print(x); } //line 3
}
class AB extends A {
AB (int x) { System.out.print(x);
super(1); } //line 7
AB() { this(2); } //line 8
}

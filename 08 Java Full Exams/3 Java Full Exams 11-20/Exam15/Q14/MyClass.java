public class MyClass {
	static int i = 7;
	public static void main(String[] args) {
		MyClass obj =new MyClass();
		obj.i++;
		MyClass.i++;
		obj.i++;
		System.out.println(MyClass.i + " "+ obj.i);
	}
}
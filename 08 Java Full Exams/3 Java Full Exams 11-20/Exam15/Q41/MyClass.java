public class MyClass {
	static void m (int i){
		i += 7;
	}
	public static void main(String[] args) {
		int j = 12;
		m(j);
		System.out.println(j);
	}
}
public class TestClass {
	public static void main(String[] args) {
		System.out.println(" hello world".trim());//A
		System.out.println("hello" + new String("world"));//B
        System.out.println("hello".concat(" world"));//C
		System.out.println(StringBuilder("world").insert(0, "hello ").toString());
		//System.out.println(new StringBuilder("world").append(0, "hello ").toString());
		System.out.println(new StringBuilder("world").append("hello ", 0 , 6).toString());//F
		//System.out.println(new StringBuilder("world").add(0, "hello ").toString());
	}
}
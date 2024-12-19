public class Question57 {
	public void print(byte x){
		System.out.println("byte");
	}
	public void print(int x){
		System.out.println("int x");
	}
	public void print (float x){
		System.out.println("float x");
	}
	public void print(Object x){
		System.out.println("Object");
	}
	public static void main(String[] args) {
		Question57 q = new Question57();
		char s = 123;
		q.print(s);
		q.print(true);
		q.print(6.789);
	}
}
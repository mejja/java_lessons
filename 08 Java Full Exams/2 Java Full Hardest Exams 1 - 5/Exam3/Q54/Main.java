public class Main {

public static void main(String[] args) {
	Super supa=new Super();
		supa.name();
	}
}
class Super {
	public static void name(){
		System.out.println("super");
	}
}
class Sub extends Super{
	protected static void name(){
		System.out.println("sub");
	}
}
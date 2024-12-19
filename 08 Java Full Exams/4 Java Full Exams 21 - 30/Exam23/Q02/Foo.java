public class Foo extends FooBase implements Bar {
	public static void main(String[] args){

	}
}
interface Bar{	
	default void bar(){}
}
abstract class FooBase{
	public static void bar(){
		System. out.println("In static bar");
	}
}

//What can be done to the above code so that it will compile without any error?
public class Foo extends FooBase implements Bar {
}
interface Bar{
void bar();
}
abstract class FooBase{
	public static void bar(){
		System. out.println("In static bar");
	}
}
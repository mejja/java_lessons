public class TestClass{
	public static void main (String [ ] args) {
	C1 o1;
	C2 o2;
	C3 o3;
}
interface I1 { }
interface I2 { }
class C1 implements I1 { }
class C2 implements I2 { }
class C3 extends C1 implements I2 { }
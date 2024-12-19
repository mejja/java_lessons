public class TestClass {
	public static void main (String[] args) {
		XXX obj = new YYY();//line 4
		obj.m();
	}
}
class XXX{
	public void m() throws Exception{
		throw new Exception () ;
	}
}
class YYY extends XXX{
		public void m() {
	}
}


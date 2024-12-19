public class TestClass{
	public static void main(String[] args){
		Super s1 = new Super(); //1
		Sub s2 = new Sub();
		s1 = (Super) s2;
	}
}

class Super { }
class Sub extends Super { }

public class TestClass2 {
    public static void main(String[] args) {
    	D d = new D();
    	System.out.println(d instanceof A);

    }
}
class A{}
class B extends A{}
class C extends B{}
class D extends C{}
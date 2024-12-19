public class TestClass {
	public static void main(String[] args){
		C1 c1= new C1();
		c1.m1(); 

	}
}
class A{
	public void m1(){
		System.out.println("In class A");
	}

}
class B1 extends A{}
class B2 extends A{
	public void m1(){
		System.out.println("In class B2");
	}

}
class C1 extends B1{}
class C2 extends B1{
	public void m1(){
		System.out.println("In class C2");
	}
}

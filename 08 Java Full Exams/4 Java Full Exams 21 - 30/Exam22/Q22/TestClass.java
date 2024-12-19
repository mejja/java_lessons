//Given that SomeException is a checked exception, consider the following code:

//in file A. java
public class A{
protected void m() throws SomeException{}

//in file B. java
public class B extends A{
public void m() { }

//in file TestClass.java
public class TestClass{
public static void main(String[] args){
//insert code here. //1

/*Which of the following options can be inserted at //1 without resulting in any compilation or runtime errors?
A).
B b = new A();
b.m();

B).
A a = new B();
a.m();

C).
A a = new B();
((B)a).m();


D).
Object o = new B();
o.m();
*/
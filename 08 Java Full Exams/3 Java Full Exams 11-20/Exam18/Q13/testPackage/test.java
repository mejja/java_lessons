//In File Test.java
package testPackage;
import other .*;
class Test{
	public static void main(String[] args){
		String hello = "Hello", lo = "lo";
		System. out.print ( (testPackage. Other.hello == hello) + " ");//line 1
		System. out. print((other.Other.hello == hello) + " ");//Line 2
		System. out. print( (hello == ("Hel"+"lo") ) + " ");//Line 3
		System. out. print((hello == ("Hel"+lo) ) + " ");//Line 4
		System.out.println(hello == ("Hel"+lo).intern());//Line 5
	}
}
class Other { static String hello = "Hello"; }
//What will be the output of running class Test?
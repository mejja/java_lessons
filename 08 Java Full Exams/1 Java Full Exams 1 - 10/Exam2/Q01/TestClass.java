public class TestClass {
	public static void main (String [] args) {
		Manager m = new Manager () ;
	}
}
class Employee {
	static int i = 10; {
		i = 15;
		System.out.print (" Employee "+i) ;
	}
	static { System.out.print (" Employee static "+i) ; }
}

class Manager extends Employee {
	static {
	i = 45;
	System. out.print (" Manager static ") ;
	}{
	i = 30;
	System.out.print (" Manager "+i) ;
	}
}
class Owner extends Manager{
static { System.out.println ("Owner") ; }
}

public class NamesMain {
	public static void main(String[] args) {
		NamePrinter NamePrinter = new NamePrinter();
		SurnamePrinter surnamePrinter = new SurnamePrinter();

		SurnamePrinter.print();
		SurnamePrinter.print();
	}
}
public class NamePrinter{
	public void print(){
		System.out.println("My name is Major");
	}
}
public class SurnamePrinter{
	public void print(){
		System.out.println("My surname is Mbandi");
	}
}
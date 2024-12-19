import java.io.Console;
import java.io.IOException;

public class Program {
	public static void main (String args[]) throws IOException {
		Console c = System.console();
		String i = c.readLine("Enter value: ");
		String name = c.readLine("Enter %d name : ",Integer.valueOf(i));
		String pwd = c.readPassword("Enter %s pwd:", "your");
		System.out.print(name +" "+(new String(pwd)));
	}
}
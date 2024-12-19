import java.io.*;

public class TestClass {
	public static void main(String[] args) throws IOException{
		Great g = new Amazing();
		g.doStuff ();
	}
}
class Great {
	public void doStuff() throws FileNotFoundException, IllegalArgumentException{
	}
}
class Amazing extends Great {
	public void doStuff() throws IOException, IllegalArgumentException{
	}
}

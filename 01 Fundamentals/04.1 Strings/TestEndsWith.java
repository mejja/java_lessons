 public class TestEndsWith {
	public static void main(String[] args) {
		String name = new String("Major");
		
		if(name.endsWith("R")){
			System.out.println("true");
		}
		else{//prints false are comparison is case sensitive
			System.out.println("false");
		}
	}
}

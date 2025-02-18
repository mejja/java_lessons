 public class TestEqualsIgnoreCase {
	public static void main(String[] args) {
		String name = new String("Major");
		
		if(name.equalsIgnoreCase("MAJOR")){
			System.out.println("true");//prints true
		}
		else{
			System.out.println("false");
		}
	}
}

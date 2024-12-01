 public class InitErrorTest {	
	static Object member = 1234;
	
	static{
		member.toString();
	}
	
	public static void main(String[] args) {	
		System.out.println("Step 1");
	}
}

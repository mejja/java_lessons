public class TestClass {

	//define tester method here
	 public String tester(){         return "false";     }

	public static void main(String[] args) throws Exception {
		TestClass tc = new TestClass();
		while(tc.tester()){
			System.out.println("running ... ");
		}
	}
}
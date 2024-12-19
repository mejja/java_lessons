public class TestClass{
	public static void main(String[] args){
		TestClass test = new TestClass();
		System.out.println(test.parseFloat("abc"));
	}
	public float parseFloat ( String s ) {
		float f = 0.0f;
		try{
			f =Float.valueOf(s).floatValue ();
			return f ;
		}
		catch (NumberFormatException nfe) {
			f = Float.NaN ;
			return f;
		}
		finally{
			f = 10.0f;
			//return f;
			System.out.println("Finally always executes");
		}
	}
}
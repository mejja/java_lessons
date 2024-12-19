public class TestClass{
	public static void main (String args [] ) {
		TestClass t = new TestClass();
		System.out.println("Invoking the method the 1st time"); 
		t.parseFloat("0.1");
		System.out.println("Invoking the method the 2nd time");  
		t.parseFloat("0x.1"); 
	}
	public float parseFloat (String s) {
		float f = 0.0f;
		
		try{
			f = Float.valueOf (s).floatValue ();
			return f ;
		}
		catch (NumberFormatException nfe) {
			System.out.println("Invalid input " + s);
			f = Float.NaN ;
			return f;
		}
		finally { 
			System.out.println ("finally"); 
		}
	}

}
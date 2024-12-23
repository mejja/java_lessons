public class TestClass{
	public static void main(String[] args){
		TestClass.parseFloat("1");
	}
	public static float parseFloat (String s) {
		float f = 0.0f;
		try{
		f = Float. valueOf (s) .floatValue ();
			return f ;
		}
		catch (NumberFormatException  nfe) {
			System.out.println ("Invalid input " + s) ;
			f = Float. NaN ;
			return f;
		}
		finally { System.out.println ("finally"); }
		//return f ;
	}
}
public class MyTest{
	public static void main (String[] args) {
		MyTest mt= new MyTest();
		mt.parseFloat("0.0");
	}

	public float parseFloat ( String s ) {
		float f = 0.0f;
		try{
			f = Float. valueOf ( s ) . floatValue () ;
			return f ;
		}

		catch (NumberFormatException nfe) {
			f = Float. NaN ;
			return f;
			}
		finally{
			f = 10.0f;
			return f;
		}
	}
}
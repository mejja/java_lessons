public class TestClass{
	public static void main (String [] args) {
		Float f = null;
		try{
			f = Float.valueOf("12.3");
			String s = f.toString () ;
			int i = Integer.parseInt (s) ;
			System.out.println ("i = "+i);
		}
		catch (Exception e) {
			System.out.println ("trouble : "+f) ;
		}
	}
}
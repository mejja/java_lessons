public class Parser{
	public static void main ( String[] args) {
		int i = 0;
		try{
			i = Integer.parseInt ( args [0] );
		}
		catch (NumberFormatException e) {
			System.out.println ("Problem in " + i );
		}
	}
}
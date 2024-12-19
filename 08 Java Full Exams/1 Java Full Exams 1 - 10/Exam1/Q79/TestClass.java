public class TestClass{
	static int value = 0; //1
	public static void main (String args []){ //2
		int 2ndArgument = Integer.parseInt (args [2]) ; //3
		if ( true == 2 > 10 ) //4

	{	value = -10;}

		else{
			value = 2ndArgument;
		}
		for ( ; value>0; value -- ) System.out.println ("A"); //5
	}
}
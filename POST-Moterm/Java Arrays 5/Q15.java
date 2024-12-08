
public class Q15{

public static void main ( String[] args )
{
	int[] myArray = {1, 2, 3, 4, 5} ;

	ChangeIt.doIt( myArray );

	for (int j=0; j<myArray.length; j++ )
		System.out.print( myArray[j] + " " ) ;
	}	

public class ChangeIt{
public static void doIt( int[] z ){
	z[0] = z[z.length-1 ];
	}
}

}
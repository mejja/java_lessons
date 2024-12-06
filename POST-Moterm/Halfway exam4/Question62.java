public class Question62{
	static public void main (String[] args){
	byte numByte = 10;
	short numShort=5;
	int nummInt = 5;
	long numLong = 10L;
	float numFloat = 3.0f;
	double numDouble = 2.0;
	long x=5;
	long y= (x=3);

     
     double result=(numByte* numShort+nummInt-numLong)/(numFloat + numDouble); //not terminated
	System.out.println(result);
	}
}
public class Question26{
	public static void main(String[] args){
		int intVal = 3;
		long longVal = 4;
		double doubleObjVal = 10.0;
		doubleObjVal = (double) intVal;
		doubleObjVal = (double) longVal;
		System.out.print(longVal);
		System.out.print(intVal);
		//prints 43 in one line as an output
	
	}
}
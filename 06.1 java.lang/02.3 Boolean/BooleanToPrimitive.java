public class BooleanToPrimitive{
	public static void main(String[] args){
		Boolean boolObject = true;

		//convert Boolean object to primitive
		boolean primitiveBoolean = boolObject.booleanValue();

		//output
        System.out.println("The Boolean object is: " + boolObject);
        System.out.println("The primitive boolean value is: " + primitiveBoolean);
	}
}
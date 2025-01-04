public class PrimitiveToBoolean{
	public static void main(String[] args){
		boolean boolPrimitive = true;//primitive

		//convert primitive to Boolean object
		Boolean boolObject = Boolean.valueOf(boolPrimitive);

		System.out.println("The primitive boolean value is: " + boolPrimitive);
        System.out.println("The Boolean object is: " + boolObject);
        
	}
}

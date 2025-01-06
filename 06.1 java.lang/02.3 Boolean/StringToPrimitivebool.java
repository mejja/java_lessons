public class StringToPrimitivebool{
	public static void main(String[]  args){
		String stringvalue = "true";

		//Convert to boolean primitive
		boolean boolPrimitive = Boolean.parseBoolean(stringvalue);

		System.out.println("String Value is:" + stringvalue);
		System.out.println("boolean primitive value is: "+boolPrimitive);
	}
}
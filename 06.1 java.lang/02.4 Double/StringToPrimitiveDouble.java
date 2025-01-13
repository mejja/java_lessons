public class StringToPrimitiveDouble{
	public static void main(String[] args){
		String stringValue = "12345.67";

		double doublePrimitive = Double.parseDouble(stringValue);

		System.out.println("String value is: "+ stringValue);
		System.out.println("Primitive double value is: " + doublePrimitive);
	}
}
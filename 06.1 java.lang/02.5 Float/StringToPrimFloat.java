public class StringToPrimFloat{
	public static void main(String[] args){
		String value = "123.45";

		float floatPrimitive = Float.parseFloat(value);

		System.out.println("String value is: "+ value);
		System.out.println("float primitive value is: "+ floatPrimitive);
	}
}
public class StringToByte{
	public static void main(String[]  args){
		String value = "123";

		Byte bytObject = Byte.valueOf(value);

		System.out.println("String value is: "+ value);
		System.out.println("Byte Object Value is: "+ bytObject);
	}
}
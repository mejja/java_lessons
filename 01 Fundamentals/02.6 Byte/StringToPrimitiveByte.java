public class StringToPrimitiveByte{
	public static void main(String[] args){
		String value = "123";

		byte bytePrimitive = Byte.parseByte(value);

		System.out.println("String value is: "+ value);
		System.out.println("byte primitive value is: "+ bytePrimitive);
	}
}
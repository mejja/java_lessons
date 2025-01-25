public class PrimitiveToObject{
	public static void main(String[] args){
		byte value = 123;

		Byte byteObject = Byte.valueOf(value);

		System.out.println("Primitive byte value is: "+ value);
		System.out.println("Object Byte value is: "+ byteObject);
	}
}
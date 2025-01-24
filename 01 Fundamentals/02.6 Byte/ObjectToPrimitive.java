public class ObjectToPrimitive{
	public static void main(String[] args){
		Byte byteObj = 123;

		byte bytePrimitive = byteObj.byteValue();

		System.out.println("Byte Object value is: "+ byteObj);
		System.out.println("byte primitive value is:"+ bytePrimitive);
	}
}
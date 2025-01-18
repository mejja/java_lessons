public class ObjectToPrimitive{
	public static void main(String[] args){
		Float floatObj = 123.45f;

		float floatPrimitive = floatObj.floatValue();

		System.out.println("Float Object value is:"+ floatObj);
		System.out.println("float primitive value is: "+ floatObj);
	}
}
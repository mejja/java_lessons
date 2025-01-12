public class PrimitiveToObject{
	public static void main(String[] args){
		float value = 123.45f;

		Float floatObj = Float.valueOf(value);

		System.out.println("float value is: "+ value);
		System.out.println("Float Object Value is: "+ floatObj);
	}
}
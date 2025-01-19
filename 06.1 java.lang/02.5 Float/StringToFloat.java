public class StringToFloat{
	public static void main(String[] args){
		String stringValue = "123.75";

		Float floatObject = Float.valueOf(stringValue);

		System.out.println("String value is: "+ stringValue);
		System.out.println("Float Object value is: "+ floatObject);

	}
}
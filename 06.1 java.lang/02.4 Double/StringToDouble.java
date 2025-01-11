public class StringToDouble{
	public static void main(String[] args){
		String stringValue = "1234.75";

		Double doubleObject = Double.valueOf(stringValue);

		System.out.println("String value is: "+ stringValue);
		System.out.println("The Double Object is: "+ doubleObject);
	}
}
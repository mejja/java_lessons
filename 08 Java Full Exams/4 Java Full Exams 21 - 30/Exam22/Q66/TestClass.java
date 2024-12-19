/*Assuming that the following method will always be called with a phone number in the format
ddd-ddd-dddd (where d stands for a digit), what can be inserted at //1 so that it will return a String
containing the same number except its last four digits will be masked with xxxx?
*/
public class TestClass{
	public static void main(String[] args){
		System.out.println(hidePhone("ddd-ddd-dddd"));
	}
	public static String hidePhone(String fullPhoneNumber){
	//1 Insert code here
	return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();
	}
}
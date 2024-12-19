public class TestClass{
	public static void main(String[] args){
		String masked =TestClass.hidePhone("0726867283");
		System.out.println(masked);
	}
	public static String hidePhone(String fullPhoneNumber){
		  return new StringBuilder(fullPhoneNumber).substring(0,8)+"xxxx";//072686xxxx
		  return new StringBuilder(fullPhoneNumber).replace(8, 12, "xxxx").toString();//072686xxxx
		  return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 7).toString();//072686xxxx
		  return new StringBuilder(fullPhoneNumber).append("xxxx").toString();//0726867283xxxx
         
         //Append with indices result to IndexOutOfBoundsException for below codes
		//return new StringBuilder(fullPhoneNumber).append("xxxx", 8, 12).toString();
	   //return new StringBuilder(fullPhoneNumber).append("xxxx", 8, 12).toString();
		//return new StringBuilder("xxxx").append(fullPhoneNumber, 0, 8).toString();
	}
}
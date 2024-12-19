public class TestClass{
	public static void main(String[] args){
		String masked =TestClass.hidePhone("072-686-7283");
		System.out.println(masked);
	}
	public static String hidePhone(String fullPhoneNumber){
		return "xxx-xxx-"+fullPhoneNumber.substring(8,12);//prints xxx-xxx-7283
		return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(8);//xxx-xxx-7283
		return new StringBuilder(fullPhoneNumber).replace(0,7, "xxx-xxx-").toString();//xxx-xxx--7283(2 dashes)
		return new StringBuilder(fullPhoneNumber).replace(0,8, "xxx-xxx-").toString();//xxx-xxx-7283(one dash)
		return new StringBuilder("xxx-xxx-")+fullPhoneNumber.substring(10);//xxx-xxx-83
	}
}
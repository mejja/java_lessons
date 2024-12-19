public class TestClass{
	public static void main(String[] args){
		System.out.println(Boolean.parseBoolean(" true "));//A
		System.out.println(Boolean.parseBoolean("true"));//B
		System.out.println(Boolean.valueOf(true));//C
 		System.out.println(Boolean.valueOf("trUE"));//D
 		System.out.println(Boolean.TRUE);//e
	}
}
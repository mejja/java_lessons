public class TestClass{
	public static void main(String[] args){
		int x = 0, y=10;
		try{
			y /=x;
		}
		System.out.print("/ by 0");
			catch (Exception e) {
				System.out.print ("error");
			}
	}
}
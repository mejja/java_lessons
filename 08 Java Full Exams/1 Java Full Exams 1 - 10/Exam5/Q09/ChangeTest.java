public class ChangeTest {

	private int myvalue = 0;

	public void showone(int myvalue){
		myvalue = myvalue;
	}
	public void showTwo(int myvalue){
		this.myvalue = myvalue;
	}
	public static void main(String[] args) {
		ChangeTest ct = new ChangeTest();
		ct.showone(100);
		System.out.println(ct.myvalue);
		ct.showTwo(200);
		System.out.println(ct.myvalue);
		
	}
}
public class LoopTest {
	int k = 5;
	public boolean checkIt(int k){
		return k -- >0?true: false;
	}
	public void printThem(){
		while(checkIt(k)){
			System.out.print(k--);
		}
	}
	public static void main(String[] args) {
		new LoopTest().printThem();
	}
}
//What changes should be made so that the program will print 54321?
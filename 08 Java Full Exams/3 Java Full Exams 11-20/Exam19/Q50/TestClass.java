public class TestClass{
	public static void main(String[] args){
		new TestClass().method1(7);
	}
	public void method1(int i) {
		int j= (i*30 - 2)/100;

		POINT1 : for(;j<10; j++){
			boolean flag = false;
			while(!flag){
				if(Math. random()>0.5) break POINT1;
			}
		}
		while(j>0){
			System. out.println(j -- );
			if(j == 4) break POINT1;
		}
	}
}
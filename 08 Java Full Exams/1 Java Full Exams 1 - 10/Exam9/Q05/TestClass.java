public class TestClass{
	public static void main(String[] args){
		int intValues[]= {10, 20, 30, 150};
		new TestClass().ProcessArray(intValues);
		//new TestClass().ProcessArray(new int[] {10, 20, 30, 150});

	}
	public void ProcessArray(int[] values){
		int sum = 0;
		int i=0;
		try{
			while(values[i]<100){
				sum=sum+values[i];
				i++;
			}
		}
		catch(Exception e){ }
		System.out.println("sum = "+sum);
	}
}
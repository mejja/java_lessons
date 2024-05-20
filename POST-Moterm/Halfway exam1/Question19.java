public class Question19{
	public static void main(String args[]){
		int a=129;
		double b = 12_81.0;
		float f = 128_1.01f;

		if(b == f)//condition is false
			System.out.println("We are equal");//not executed
			a +=b;//always execute as its outside the if statement 
		System.out.println(a);//129+1281=1410
	}
}
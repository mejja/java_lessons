public class Question15{
	public static void main(String[] args){
		int a = 17, x = 5, y =12;
		if (x>y);//premature termination of if condition
		//since below block of code is not part of if condition it will always execute and update variable a and x
		{
			a=13;
			x=23;
		}
		System.out.println(a);
		System.out.println(x);
	}
}
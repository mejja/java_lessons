public class DemoMain{
	public static void main(String[] args){
		int x=9;
		if (x>0);//premature termination of if statement without code block
		else 
		System.out.println("positive");//execute if condition is false
		System.out.println("negative");//this block is outside the if-else hence always execute
	}
}
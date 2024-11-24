//imports
import java.util.Scanner;
public class Prompter{
	public static double prompt(String message){
		System.out.println(message);
		Scanner input= new Scanner(System.in);//create a scanner object
		return input.nextDouble();
	} 
	public static char promptOper(String message){
		System.out.println(message);
		Scanner input= new Scanner(System.in);//create a scanner object
		return input.next().charAt(0);
	} 
}
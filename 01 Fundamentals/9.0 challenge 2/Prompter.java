import java.util.Scanner;//import scanner class

public class Prompter{
	public static String prompt(String message){
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}	
}
//Import Scanner Class
import java.util.Scanner; 

public class Prompter{
	//for string input
	public static String prompt(String message){
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		String prompt = input.next();
		return prompt;
	}
	//for numeric input
    // public static String promptInt(String message){
	// 	System.out.println(message);
	// 	Scanner input = new Scanner(System.in);
	// 	int promptInt = input.nextint();
	// 	return promptInt;
	// }

}
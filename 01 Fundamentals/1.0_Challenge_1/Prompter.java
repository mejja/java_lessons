//Import Scanner Class
import java.util.Scanner; 
public class Prompter{
	public static String prompt(String message){
		System.out.println(message);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}

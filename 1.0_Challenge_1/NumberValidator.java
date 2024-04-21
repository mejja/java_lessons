import java.util.Scanner;

public class NumberValidator{
	public static boolean NumIsValid(int distance_from_store){
		Scanner sc = new Scanner(System.in);
		do{
			// System.out.println("How far is your favourite store from your home?");
			while(!sc.hasNextInt()){
				System.out.println("That's not a number!");
				sc.next();
			}

		distance_from_store= sc.nextInt();
		}while (distance_from_store <= 0);
		System.out.println("Thank you! Got " + distance_from_store);
		return false;
		
	}
}
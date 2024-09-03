public class Question10{
	public static void main(String[] args){
		int guess = 7;
		int answer = 9;

		if ((guess < answer) && (guess> answer) ?  false: true){
			System.out.println("Your guess is too low");
		}
		else if ((guess == answer) || (guess > answer) ? true: false){
			System.out.println("you are right!");
			}
		else{
			System.out.println("Your guess is too high");
		
		}
	}
public class Question09{
	public static void main(String[] args){
		int guess = 7;
		int answer = 9;
		if (guess < answer)
			System.out.println("Your guess is too low");
		else if (guess = answer)//compilation error assignement instead of equality
			System.out.println("you are right!");
		else
			System.out.println("Your guess is too high");
}
}
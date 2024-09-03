public class Question14{
	public static void main(String[] args){
		String test="true";
		boolean result = false;
		if (test.equals("True")){
			System.out.println("Your guess is too low");
		}
		else if(test.equals("true ")){
			System.out.println("You are right!");
		}
		else if(result = true){
			System.out.println("Keep on trying");
		}else{
			System.out.println("Your guess is too high");
		}
	
	}
}
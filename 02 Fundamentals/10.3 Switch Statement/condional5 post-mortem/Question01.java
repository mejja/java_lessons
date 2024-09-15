public class Question01{
	public static void main(String[] args){
		String numberAsString = "153.25";
		double number = Double.parseDouble(numberAsString);
		if (number <= 153.26){
			System.out.println("the number is: " +number++);
		}
	
	}
	
}
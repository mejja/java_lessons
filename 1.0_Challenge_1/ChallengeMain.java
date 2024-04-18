public class ChallengeMain{
	public static void main (String[] args){
		String name = Prompter.prompt("What is your name");
		String surname = Prompter.prompt("What is your name");
		String date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YYYY):");
		String distance_from_store = Prompter.prompt("How far is your favourite store from your home?");
		double distance = Double.parseDouble(distance_from_store);//Cast distance string to double first
	    
	    Printer.print();
	}
	
}
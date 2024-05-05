public class ChallengeMain{
	public static void main(String[] args){
		String name = Prompter.prompt("What is your name");
		String surname = Prompter.prompt("What is your name");
		
		String date_of_birth;
		while (true) {
			date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YYYY): ");
			
			//Validate date entered
			boolean isDOBvalid = DateValidator.dateIsValid(date_of_birth);
			
			if (!isDOBvalid) {
				System.out.println(" Date must be in DD/MM/YYYY format\n");
				continue;//prompt for imput invalid date is entered
			} 

			//Validate that a future date is entered
			boolean currentDate= DateValidator.pastValidDate(date_of_birth);
			
			if(!currentDate){
			System.out.println("The date must not be a future date!!");
			 }else {
			 	//Exit loop for valid non-future date
				break;
			}
	    }	
		
		//convert date into integer
		String[] arrOfStr= date_of_birth.split("/", 3);
		int dob_year = Integer.parseInt(arrOfStr[2]);
		long age=AgeCalculator.calc(dob_year);

		//Distance
		String distance_from_store;
		while (true) {
			distance_from_store = Prompter.prompt("How far is your favourite store from your home?");
			boolean isNumvalid = NumberValidator.numIsValid(distance_from_store);
			if (!isNumvalid) {
				System.out.println(" Please Enter a valid number\n");
			} else {
				break;
			}
		}
		double distance=Double.parseDouble(distance_from_store);
		double distance_in_miles=MilesCalculator.calc(distance);

		//Pass arguments to printer class for output
		Printer.print(name, surname, age, distance_in_miles);

	}
}

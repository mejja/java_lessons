// Date validator method using specific format using SimpleDateFormat 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class DateValidator{
	public static void main(String args[]){
		String date = "14/04 /2024";//user input sample

		//define Expected date format(so date object strictly matches our pattern)
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		//Set linient to false to apply strict date parsing
		dateFormat.setLenient(false);

		//Try and catch errors on Entered date
		try{
			//parse the user input into a date object
			Date parseDate = dateFormat.parse(date);
			System.out.println( "Valid date format: " + dateFormat.format(parseDate));
		}
		catch (ParseException e){
			System.out.println("Invalid date format. " + date + " instead of: DD/MM/YYYY");
		}
	}
}
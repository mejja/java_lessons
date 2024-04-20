import java.util.*; //import date
import java.time.*;
import java.text.SimpleDateFormat;


public class AgeCalculator{
	public static void main(String[] args){
		String date_of_birth = "01/01/1999"; 
		Date SysDateObj = new Date(); //Create a date object
		System.out.println(SysDateObj);//Print current date before formatting

		SimpleDateFormat myFormatObj = new SimpleDateFormat("dd/MM/yyyy");

		String formattedDate = myFormatObj.format(SysDateObj);
		System.out.println("After Formatting: " + formattedDate);

		SimpleDateFormat formatNowYear = new SimpleDateFormat("yyyy");
		java.util.Date nowDate = new java.util.Date();
		String currentYear = formatNowYear.format(nowDate);
		System.out.println(currentYear);
	


	}
}
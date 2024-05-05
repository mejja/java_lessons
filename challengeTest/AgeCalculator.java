import java.time.Year;

public class AgeCalculator{
	public static long calc(long dob_year){
		long current_year= Year.now().getValue();
		long age=current_year-dob_year;
		return age;

	}
}

public class MilesCalculator{
	public static double calc(double distance_from_store){
        //distance conversion to miles
		double distance_in_miles = distance_from_store * 0.621371;
		return distance_in_miles;
	}
}
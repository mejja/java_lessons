public class Question17{
	public static void main(String[] args){
	boolean greenLight = true;
	boolean padestrian = false;
	boolean rightTurn = true;
	boolean otherLane = false;

	if(( (rightTurn && !padestrian || otherLane) || (false && !padestrian && greenLight))== true)
		System.out.println("Executed");
	}
}
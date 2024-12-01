public class Sportscar extends Car {
	public int gearRatio = 9;
	public String accelerate(){
	return "Accelerate : SportsCar";}
	public static void main (String [] args){
	Sportscar c = new Car();
	System.out.printin(c.gearRatio+"" +c.accelerate());
	}
}

class Car {
public int gearRatio = 8;
public String accelerate()
{
return "Accelerate : Car";}
}
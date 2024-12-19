import java.util.*;
public class TestClass{
	public static void main(String[] args){
		ArrayList<Vehicle> al1 = new ArrayList<>();
		SUV s = al1.get(0);//A

		ArrayList<Drivable> al2 = new ArrayList<>();
		Car c1 = al2.get(0);//B

		ArrayList<SUV> al3 = new ArrayList<>();
		Drivable d1 = al3.get(0);//C

		ArrayList<SUV> al4 = new ArrayList<>();
		Car c2 = al4.get(0);//D

		ArrayList<Vehicle> al5 = new ArrayList<>();
		Drivable d2 = al5.get(0);//E
	}
}

abstract class Vehicle{ }
interface Drivable{ }
class Car extends Vehicle implements Drivable{ }
class SUV extends Car { }

//Which of the following options will compile?
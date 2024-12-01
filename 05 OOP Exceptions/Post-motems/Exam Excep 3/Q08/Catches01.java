package oop.catches;

public class Catches01 {
	public static void main(String[] args) {
		try{
			System.out.println("Step 1");
		try{
			System.out.println("Step 2");
		try{
			System.out.println("Step 3");
		throw new Exception("Failure");
		}
		catch(Exception e){
			System.out.println("Step 4");
		}
			System.out.println("Step 5");
		}
		catch(Exception e){
			System.out.println("Step 6");
		}
			System.out.println("Step 7");
		}
		catch(Exception e){
			System.out.println("Step 8");
		}
	}
}
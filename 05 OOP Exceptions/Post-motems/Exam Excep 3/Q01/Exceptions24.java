package oop.exceptions2;

public class Exceptions24 {
	public static void main(String[] args) {
		int a = 5;
		if(a>3){
		throw new NoClassDefFoundError("Failure");
		}
	}
}
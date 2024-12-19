import java.io .*;
public class Whizlabs{
	public static void main(String args[]){
		try{
		int whizData[] = new int[10];
		System.out.println("Accessing Element Eleven :" + whizData[11]);
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Oops .. Identifed Exception :: " + e);
		}
	}
}
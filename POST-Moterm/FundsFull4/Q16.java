import java.util.*;
public class Q16 {
	public static void main(String[] args){
		int i;
		try{
			 i =0;
			i= Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println("Problem in "+ i);
		}
	}
}
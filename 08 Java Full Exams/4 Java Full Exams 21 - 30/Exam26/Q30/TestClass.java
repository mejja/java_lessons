import java.util.*;
public class TestClass{
	public static void main (String[] args) {
		int [] intArr = {15, 30, 45, 60, 75};
		intArr[2] = intArr [4];
		intArr [4] = 90;
		/*for(int i=0; i<intArr.length; i++){
			System.out.println(intArr[i]);
		}*/
		for(int i: intArr){
			System.out.print(i + " ");
		}
	}
}
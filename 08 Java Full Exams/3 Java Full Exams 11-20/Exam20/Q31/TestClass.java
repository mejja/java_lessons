import java.util .*;
public class TestClass {
	public static void main(String[] args){
		int i = 0;
		int j= 1;
		if((i++ ==0) & (j++ == 2)){
			i=12;
		}
		System.out.println(i+" "+j);
	}
}
import java.util.*;
public class TestClass{
	public static void main (String[] args) {
		int i = 0;
		do {//A
		System.out.println(i++);
		} while (i < 50);


		int i = 0;
		do//b
			System.out.println(i++);
		while (i < 50);

		int i = 0;
		do//d
			System.out.println(i++);
		while i < 50;


		i = 0;
		do//b
		System.out.println(i);
		i++;
		i++;
		i++;
		while (i < 50);
	}
}
//Which of the following do/while loops will compile without errors?

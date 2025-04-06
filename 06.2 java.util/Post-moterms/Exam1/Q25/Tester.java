public class Tester {
	public static void main(String[] args) {
		Object obj = new int[] {1,2,3};//line 3
		int[] someArray = (int [])obj; //line 4
		for (int i : someArray) //line 5
		System.out.println(i +" "); // line 6
	}
}
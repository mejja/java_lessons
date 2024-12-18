public class Q05 {
	public static void main(String[] args) {
		int[] x={1,2,3,4};
		int[] y= x;

		x= new int[6];

		for(int i=0; i<x.length; i++)
		System.out.println(x[i] + " ");
	}
}
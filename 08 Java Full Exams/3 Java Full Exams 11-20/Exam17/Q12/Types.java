public class Types{
	public static void main(String [] args){
		boolean a = true;
		boolean b = false;
		long c = 10;

		a = (c > 9 && c != 9.9) | (b = true);

		System.out.println(a +", "+ c +", " + b);

		System.out.println(" AND ");

		System.out.println(1+((4*8)/16)/65);
	}
}
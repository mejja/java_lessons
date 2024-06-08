public class Question70{
	public static void main(String args[]){
		int num1 =20;
		int num2 =10;

		int sum = num1 + num2;
		int difference = num1++ - sum++;
		int product = ++difference * ++num2;
		int quotient= ++num1 /product;
		int modulus = quotient++ % num2;

		System.out.println(modulus + sum);
	
	}
}
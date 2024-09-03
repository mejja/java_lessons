public class Question06{
	public static void main(String[] args){
		double discount;
		char code ='X';

		switch (code)
		{
			case 'A':
				discount =0.0;
				System.out.println(discount);
				break;

			case 'B':
				discount =0.1;
				System.out.println(discount);
				break;

			case 'C':
				discount =0.2;
				System.out.println(discount);
				break;

			default:
				discount =0.3;
				System.out.println(discount);
		}
}
}
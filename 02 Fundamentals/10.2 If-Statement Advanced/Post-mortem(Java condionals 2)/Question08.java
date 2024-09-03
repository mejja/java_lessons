public class Question08{
	public static void main(String[] args){
		double discount;
		char code = 'b';

		switch (code){
		case 'a':
			case 'A':
				discount =0.0;
				System.out.println(discount);
				break;
			case 'b':
			case 'B':
				discount =0.1;
				System.out.println(discount);
				break;
			case 'c':
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
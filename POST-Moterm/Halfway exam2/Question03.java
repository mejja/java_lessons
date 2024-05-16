public class Question03{
	public static void main(String[] args){
		int a = 10;
		int b = 5;

		switch(a){
		case 50:
			a = a*b;
			System.out.println("A1: " + a);
			break;
		case 10:
			System.out.println("A2: " + a);//this statement will print on screen
			break;
		default:
			System.out.println("A3: " + a);
			break;
			}
	}
}
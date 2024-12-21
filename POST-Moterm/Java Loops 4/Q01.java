public class Q01 {
	public static void main(String[] args) {
		String B = "CSE";
		String A= B;
		int year =2;

		switch(year){
		case 1:
			System.out.println("A");
			break;
		case 2:
			switch(A)
			{
			case "CSE":
			case "CCE":
				System.out.println("AB");
				break;

			case "ECE":
				System.out.println("ABC");
				break;
			default:
				System.out.println("ABCD");
			}
		}
	}	

}
public class Question10{
	public static void main(String[] args){
		int movie = 3;
		switch(movie * (5+movie))//evaluate switch to 24 which result to default being exexute as there is no case 24
		{
		default:
			System.out.print("Godzilla");
			break;
		case 6:
			System.out.print("Titanic");
			break;
		case 15:
			System.out.print("Black Panther");
			break;
		}
		
	}
}
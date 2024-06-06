public class Question61{
	public static void main(String args[]){
		int movie =1;
		switch (movie << 2 + movie){//shifting the binary bits of movie by three positions 0001 =1000 
			                        //hence it will switch(8)
			default:
			System.out.println("Godzilla");//default case is execute since there 
			                                //is no case match the switch value 8
			break;
			case 4:
			System.out.println("Titanic");
			break;
			case 5:
			System.out.println("Black Panther");
			break;
		}
	
	}
}
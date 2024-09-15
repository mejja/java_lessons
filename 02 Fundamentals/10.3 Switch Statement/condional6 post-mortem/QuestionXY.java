public class QuestionXY{
	public static void main(String[] args){
		int i=20, j=10;
		boolean b = (i<j)? (j<i)? ((i%2 == 0) && (j/2 == 5))?
		true: false: true: false;
		if(b){
			System.out.println("Hello");
		}
		else{
			System.out.println("Bye");
		}
	}
}
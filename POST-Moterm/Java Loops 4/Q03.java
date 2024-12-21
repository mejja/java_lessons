public class Q03 {
	public static void main(String[] args) {

		int MAX_TERM =100;
		int sum = 0.0;
		for(int term =1; term <= MAX_TERM; term++){

			if(term % 2==1){
				sum +=1.0 / (term *2-1);
				System.out.println("Done");
			}
			else{
				System.out.println("Done Done");
			}
		}
	}
}
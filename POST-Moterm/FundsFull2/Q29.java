public class Q29 {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Break");
		while(count <=10){
			count =count +1;
			if(count == 5){
				break;
			}
			System.out.println(count++);
			break;
		}
		}	
}
public class Question07{
	public static void main(String[] args){
		float a = 5.02f;
		double b = 5.2;

		if((b <= a) || (++b<a) | a++ < b){
			b = b+1;
			System.out.println("executed");
		}
		if((15.02 >=15.5) & false){//this if blocl is not executed
			b = b+10;
			System.out.println(b +" "+a);
		}
		if((b >=1) && ++b < 12){
			System.out.println(b +" "+a);
		}

		System.out.println();
	}
}

public class Q21{
	public static void main (String[] args){
		int sum=0;
		int n =0;

		for(n=0; n<6; n++){
			sum+=n%10;
			sum++;
		}
		System.out.println(sum);
		sum++;
	}
}
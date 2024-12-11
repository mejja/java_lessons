public class Q16{
	public static void main(String[] args){
		int count=0, sum=0;
		do{
			if(count%2==1)continue;
			sum+=count;
		}while(count++<11);
		System.out.println(sum);
	
	}
}
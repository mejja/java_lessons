public class Fibonacci{
	public static void main(String[] args){
		//for loop to print 15 fibonacci numbers
		for(int i=0, j=-1,next=1;i<15;i++){
			int sum=j+next;
			j=next;
			next=sum;
			System.out.println(sum);
		}
	}
}
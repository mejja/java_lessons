public class Arrays2Basics5{
	public static void main(String[] args){
		int[] arr = new int [50];
		for(int i=0; i< arr.length; i++){
			arr[i]= i+1;
			if((arr[i] % 2 == 0) &&(arr[i] % 11 == 0))
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Array Values + 1");
		for(int j=0; j< arr.length; j++){
			int increment= arr[j]+1;
			if((increment % 2==0) && (increment % 11 == 0))
			System.out.print(increment + " ");
		}
	}
}
public class Arrays2Basics6{
	public static void main(String[] args){
		int[] arr = new int [50];
		int i=0;
		while( i< arr.length){
			arr[i]= i+1;
		switch(arr[i]%2){
		case 0:
		switch(arr[i]%11){
		case 0:
			System.out.print(arr[i] + " ");
		    break;
		}
		 default:
		 	break;
		}
		i++;
		}
		System.out.println(" ");
		System.out.println("Array Values + 1");
		int j=0;
		while(j< arr.length){
			int increment= arr[j]+1;
		switch(increment % 2){
		case 0:
		switch(increment % 11){
		case 0:
			System.out.print(increment + " ");
			break;
		}
		default:
			break;
		}
		j++;
	}
}
}
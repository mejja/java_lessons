// import java.util.Arrays;
public class Arrays2Basics3{
	public static void main(String[] args){
		int[] arr = {100,20,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
		26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,42,43,44,45,46,47,48,49,50};
		System.out.println("Array Values ");
		int i=0;
		while (i<arr.length) {
			switch(arr[i] % 2){
		case 0:
			switch(arr[i] % 11){
			case 0:
			System.out.print(arr[i] + " ");
		    break;
		    }
		 default:
		 	break;
		}
		i++;
		}
		//Array values increment by 1
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
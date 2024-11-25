public class CodeAlong6{

	public static void count(int[][] arr){
		int count=1;
		for(int i=0; i<arr.length; i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=count++;
			}
		}
	}
	//printing
	public static void print(int[][] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print("[ ");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ]");
		}
	}
	public static void main(String[] args){
		int[][] myArray = new int[10][10];
		count(myArray);
		print(myArray);
	}
}
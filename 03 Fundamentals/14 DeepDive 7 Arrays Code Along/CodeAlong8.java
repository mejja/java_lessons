public class CodeAlong8{
	public static void main(String[] args){
		int[][] arr2D=new int[10][10];
		//2D array population
		int count=1;
		for(int i=0; i<arr2D.length; i++){
			for(int j=0;j<arr2D[i].length;j++){
				arr2D[i][j]=count++;
			}
		}
		//invoke getRow method with row 3
		int[] row =getRow(arr2D, 10);

		//print the returned row
		if(row != null){
			System.out.println("Row: ");
			for(int rowValues: row){
				System.out.print(rowValues + " ");
			}
		}
	}
	public static int[] getRow(int[][] arr2D, int row){
		if(row<0 || row>=arr2D.length){
			System.out.println("Error:Row " + row+" indexOutOfBound");
			return null;
	}
	return arr2D[row];
}

}
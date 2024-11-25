import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge361{
	public static void main(String[] args){
		int[][][] arr3d = new int [10][10][3];
		int [][] arr2d = new int [10][10];

		 Random random = new Random();//Random object instantiation

		//populate the 2D array
		for(int i = 0; i<arr2d.length; i++){//outer 
			for(int j=0; j<arr2d[i].length; j++){//inner
				arr2d[i][j] = random.nextInt(100);
			}
		}
		//populate the 2D array
		for(int i=0; i<arr3d.length; i++){//outer
			for(int j=0; j<arr3d[i].length; j++){//middle
				for(int k=0; k<arr3d[i][j].length; k++){//inner
					arr3d[i][j][k] = random.nextInt(100);
				}
			}
		}

		//Printing outputs 2D
		System.out.println("2D_Arrays");
		System.out.println(Arrays.deepToString(arr2d));
		//Printing outputs 3D
		System.out.println(" ");
		System.out.println("3D_Arrays");
		System.out.println(Arrays.deepToString(arr3d));
	}
}
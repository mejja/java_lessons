public class Q24 {
	public static void main(String[] args) {
		double daaa[][][] = new double[3][][];
		double d = 100.0;
		double[][] daa = new double[1][1];
		daa[0][0]=d;//compiles
		daaa[0]=daa;//compiles
		daa = daaa[0];//compiles
		}	
}
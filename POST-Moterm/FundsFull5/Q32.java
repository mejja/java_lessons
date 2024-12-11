public class Q32{
	public static void main (String[] args){
		double[] a = new double[5];
		int nonzeroCt= 0;
		double total =0;

		for(int i=0; i<5; i++){
			if(a[i] !=0){
				total +=a[i];
				nonzeroCt++;
			}
		}
		System.out.println(total);
	}
}
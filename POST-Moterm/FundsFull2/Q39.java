public class Q22 {
	public static void main(String[] args) {
		int i=3, j=5;
		lab1: for(;;i++){
			for(;;--j)if(i>j)break lab1;
		}
		System.out.println("i= "+i+" ,j="+j);//i=3, j=2
	}
}
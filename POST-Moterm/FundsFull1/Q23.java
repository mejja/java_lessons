public class Q23 {
	public static void main(String[] args) {
		int[] lotto = {233,444, 678};

		for(int tempValue : lotto){
			int i=0;
			while(i<lotto.length){
				System.out.print(+ tempValue + ",");//print values thrice
				i++;
			}
		}
	}	
}

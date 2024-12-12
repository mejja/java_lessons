public class Q01 {
	public static void main(String[] args) {
		
		int i=0, j=5;
			lab1: for(;;i++){
				lab2:for(;;--j)
					if(i>j) break lab2;
			}
		System.out.println("i="+i+", j="+j);
		
		}
	}


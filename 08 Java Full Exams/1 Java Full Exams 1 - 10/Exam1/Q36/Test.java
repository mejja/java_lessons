public class Test {
	public static void main(String args []) {
	int i = -2, j = 2;

	for(;++i>0;){
		i = ++i;
		j --;
	}
	System.out.println(i);
	}
}
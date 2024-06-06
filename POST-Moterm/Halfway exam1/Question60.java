public class Question60{
	public static void main(String args[]){
		byte b =4;
		int i = 2023;
		// long l = ++i += b--;// won't compile
		i++;
		i +=b;
		b--;
		long l = i;
		System.out.println(l);
	
	}
}
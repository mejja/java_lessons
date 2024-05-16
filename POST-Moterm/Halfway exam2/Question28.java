public class Question28{
	public static void main(String[] args){
		byte b =-127;
		short s =(short)200000;//fixed by casting
		int i = 670000;
		long l = 190;
		float f = 167;
		double d = 687.9f;
		i=(short)(i+s+b+ d/f*l);
	

	}
}
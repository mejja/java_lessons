public class Question15{
	public static void main(String[] args){
	 int x= 0;
	 labell:
	 if (++x<10 && (x /0 < 10)){
	 	 System.out.println("Bishal");
	 	continue labell;
	 }else{
	 	System.out.println("GEEKS");
	 }
	}
}
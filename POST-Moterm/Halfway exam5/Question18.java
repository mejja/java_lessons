public class Question18{
	public static void main(String[] args){
	 int x =2;
	 switch(x){
	 case (x<5)://compilation errror
	 	System.out.println("BIG");
	 	break;
	 case x>5://compilation errror
	 	System.out.println("SMALL");
	 default:
	 	System.out.println("CORRECT");
	 	break;
	 }
	 System.out.println(total);
	}
}
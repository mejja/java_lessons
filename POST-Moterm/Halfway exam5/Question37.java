public class Question37{
	public static void main(String[] args){
	 int x= 2; int y=3;
	 if ((y == x++) && (x< ++y)){//does not evaluate 2nd part since the 1st is false
	 		System.out.println("x =" + x +" y =" + y);
	 	}else{
	 		System.out.println(x+ " "+y);//print 3 3
	 	}
	 }
}

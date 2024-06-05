public class Question48{
	public static void main(String args[]){
		int a =15;
		double b = 12;
		if(( ++b == a--) && (--a <b--)){
			System.out.println(b);
		}else{
			b -=a-- * ++a;
			System.out.println(a);
		}

		System.out.println(b);
	
	}
}
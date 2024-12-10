public class Question19{
	public static void main(String[] args){
	byte b =1;
	char c = 1;
	short s = 1;
	int i = 1;

	s=s+i;//compilation error
	s+=b;//s=(short)(s+b)
		System.out.println(s);
	}
}
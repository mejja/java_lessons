public class Question68{
	public static void main(String args[]){
		//error mix boolean literals(true & false) with arthmetic operators + plus a string
		System.out.println(true | false & true + ",");//compilation error
		System.out.println(false & true | true);//true
	
	}
}
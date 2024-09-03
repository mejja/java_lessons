public class Question05{
	public static void main(String[] args){

	int a=2000;
	String result=((a%4 == 0)&&(a%100 !=0)) && (a%400 ==0)? (a%400==0)?"First":"Second":"Third";
	System.out.println(result);
	}
}
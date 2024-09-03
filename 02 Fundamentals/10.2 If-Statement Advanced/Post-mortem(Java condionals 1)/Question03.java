public class Question03{
	public static void main(String[] args){

	int a=2020;
	String result=((a%4 ==0)&&(a%100 !=0)) || (a%400==0)?"leap":"not leap";
	System.out.println("The year is: "+ result + " year");
	//print is not leap year 
	//if either year modulo 4 is 0 and year modulo 100 is not equal to 0 or year modulo 400 is zero
	}
}
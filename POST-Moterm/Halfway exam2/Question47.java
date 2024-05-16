public class Question47{
	public static void main(String[] args){
		String str ="abcde";
		String str2 = "Hello planet earth, you are a great planet.";
		System.out.println(str.length());//5 string allocation 
		System.out.println(str.indexOf("a"));//0
		System.out.println(str.indexOf("earth"));//-1 since index out of reach
		System.out.println(str2.indexOf("earth"));//13 prints start index position of word earth
		System.out.println(str.lastIndexOf("e"));//4
		System.out.println(str.substring(3, 5));//de check for position and not indexes


	}
}
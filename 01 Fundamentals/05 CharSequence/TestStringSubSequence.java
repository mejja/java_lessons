public class TestStringSubSequence{
	public static void main(String[] args){
		String value = "ABCDEMAJORABCDE";

		//Prints MAJOR
		System.out.println(value.subSequence(5,10));
	}
}
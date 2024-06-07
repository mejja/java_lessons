public class Question64{
	public static void main(String args[]){
		byte b = 127;
		int a = 127;
		String s ="127";

		boolean bool = (b>a? true:false);
		if (bool){//false hence switch statement are not executed 
			switch(s){
				case " ":
					System.out.println("I am an integer");
				case "197":
					System.out.println("I am also a String");
					break;
				default:
					System.out.println("I am in a default");
				case "127":
					System.out.println("I am a byte");
			}
		}
	}
}
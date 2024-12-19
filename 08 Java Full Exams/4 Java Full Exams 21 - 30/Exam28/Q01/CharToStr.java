import java.util.*;
class CharToStr{
	public static void main(String[] args) {
		String str1="Java";
		char str2[]= {']' , 'a' , 'v' , 'a'};
		String str3="";
		for (char c: str2){
			str3=str3+c;
		}
		if (str1. equals (str3)){
			System. out.println("Successful");
		}else {
			System. out.println("Unsuccessful");
		}
	}
}
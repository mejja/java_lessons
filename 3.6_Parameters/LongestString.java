public  class LongestString {
	public static void main(String[] args){
		String str1 = "Kenya";
		String str2 = "Uganda";
		String str3 = "Tanzania";
		String str4 = "There are all equal";

		String longest= findTheLongest(str1, str2, str3, str4);
		System.out.println("The Longest String is:  " + longest);
	}
	public static String findTheLongest(String a, String b, String c, String d){
		if(a.length() > b.length() && a.length() > b.length()){
			return a;
		}else if (b.length() > c.length()){
			return b;
		}else if(c.length() > b.length()){
			return c;
		}else{
			return d;
		}
	}
}
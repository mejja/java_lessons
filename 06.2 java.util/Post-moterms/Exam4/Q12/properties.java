import java.util .*;
class properties {
	public static void main(String args[]) {
		Properties obj = new Properties();
		obj.put("AB", new Integer(3));
		obj.put("BC", new Integer(2));
		obj.put("CD", new Integer(8));
		System.out.print(obj.keySet());
	}
}
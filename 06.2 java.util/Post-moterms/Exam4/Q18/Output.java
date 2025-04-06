import java.util .*;
class Output {
	public static void main(String args[]) {
		Hashtable obj = new Hashtable();
		obj.put("A", new Integer(3));
		obj.put("B", new Integer(2));
		obj.put("C", new Integer(8));
		System.out.print(obj.contains(new Integer(5)));
	}
}
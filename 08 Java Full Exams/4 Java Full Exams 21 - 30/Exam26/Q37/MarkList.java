public class MarkList {
	int num;
	public static void graceMarks (MarkList obj4) {
		obj4.num += 10;
	}
	public static void main (String[] args) {
		MarkList obj1 = new MarkList () ;
		MarkList obj2 = obj1;
		MarkList obj3 = null;
		obj2.num = 60;
		graceMarks (obj2);
	}
}
//how many MarkList instances are created in memory at runtime?
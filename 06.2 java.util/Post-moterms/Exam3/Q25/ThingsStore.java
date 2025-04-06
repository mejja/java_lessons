import java.util.*;

public class ThingsStore{
	public static void main(String[] args){
		ArrayList<Things> al = new ArrayList<Things>();
		al.add(new Things(10));
		al.add(new Things(20));
		System.out.println(al.size);
	}
}
class Things impplements Comparator{
	int i;
	Things (int s) { this.i = s; }
	public int compareTo(Object o) {return this.i - ((Things)o).i; }
}
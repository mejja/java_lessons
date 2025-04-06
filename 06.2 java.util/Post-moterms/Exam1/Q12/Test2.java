package ocjp.util;
import java.util.ArrayList;
import java.util. Collections;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Test2Bean> list = new ArrayList<>();//a

		list.add(new Test2Bean("1"));//b
		list.add(new Test2Bean("4"));
		list.add(new Test2Bean("3"));
		list.add(new Test2Bean("2"));

		System.out.println("Before:"+list);//c
		Collections.sort(list);//d
		System.out.println("After:"+list);
		}
	}

		class Test2Bean implements Comparable {
			Test2Bean(String name) {
				this.name= name;
			}
		String name;
		@Override
		public String toString() {
			return name;
		}
		@Override
		public int compareTo(Object o) {
			return 0;
		}	
}
import java.util.ArrayList;
import java.util.Collections;

import java.util.*;
public class TesterClass {
	public static void main(String[] args) {

	ArrayList arrayList = new ArrayList();

	arrayList.add("A");
	arrayList.add("B");
	arrayList.add("C");
	arrayList.add("D");
	arrayList.add("E");

	Collections.swap(arrayList,0,4);

	System.out.println("ArrayList contains : " + arrayList);
	}
}
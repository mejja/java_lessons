import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class TestHashSet{
	public static void main(String[] args){
		Set<String> hashSet = HashSetAdd.Add();
		System.out.println("After Addition: " +hashSet);

		Set<String> modifiedSet = HashSetRemove.Remove(hashSet);
		System.out.println("After element removal: " +modifiedSet);


		ArrayList<String> arrayList = HashSetToArrayList.convertToArrayList(modifiedSet);
		System.out.println("ArrayList: "+ arrayList + " Type: "+arrayList.getClass().getSimpleName());
	}
}
class HashSetAdd{
	public static  Set<String> Add(){
		//create an instance of HashSet
		Set<String> hashSet = new HashSet<>();
		//adding elements to Hashset
		hashSet.add("Kenya");
		hashSet.add("Uganda");
		hashSet.add("Tanzania");
		return hashSet;
	}
}
class HashSetRemove{
	public static Set<String> Remove(Set<String> hashSet){
		hashSet.remove("Tanzania");
		return hashSet;
	}
}
class HashSetToArrayList{
	public static ArrayList<String> convertToArrayList(Set<String> hashSet){
		return new ArrayList<>(hashSet);
	}
}

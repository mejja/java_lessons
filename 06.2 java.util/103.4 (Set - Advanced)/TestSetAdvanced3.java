import java.util.*;

public class TestSetAdvanced2 {
    public static void main(String[] args) {
        // 1. Create a HashSet and add Integer objects
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Microsoft");
        hashSet.add("Apple");
        hashSet.add("Meta");
        hashSet.add("Amazon");

        // 2. Print the unordered content of the HashSet
        System.out.println("Unordered content of the HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Convert the HashSet to a List to sort it
        List<String> list = new ArrayList<>(hashSet);

        // Sort the List
        Collections.sort(list);

        // Print the sorted content of the List
        System.out.println("\nSorted content of the hashSet List:");
        for (String number : list) {
            System.out.println(number);
        }

        // Example usage of LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("C#");
        linkedList.add("Python");

         // Convert the linkedList to a List to sort it
        List<String> list2 = new ArrayList<>(linkedList);

        // Sort the List
        Collections.sort(list2);

        // Print the sorted content of the List
        System.out.println("\nSorted content of the linkedList:");
        for (String number : list2) {
            System.out.println(number);
        }
    }
}

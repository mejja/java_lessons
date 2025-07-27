import java.util.*;

public class TestSetAdvanced2 {
    public static void main(String[] args) {
        // 1. Create a HashSet and add Integer objects
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(44);
        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(33);

        // 2. Print the unordered content of the HashSet
        System.out.println("Unordered content of the HashSet:");
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Convert the HashSet to a List to sort it
        List<Integer> list = new ArrayList<>(hashSet);

        // Sort the List
        Collections.sort(list);

        // Print the sorted content of the List
        System.out.println("\nSorted content of the hashSet List:");
        for (Integer number : list) {
            System.out.println(number);
        }

        // Example usage of LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(90);
        linkedList.add(110);

         // Convert the linkedList to a List to sort it
        List<Integer> list2 = new ArrayList<>(linkedList);

        // Sort the List
        Collections.sort(list2);

        // Print the sorted content of the List
        System.out.println("\nSorted content of the linkedList:");
        for (Integer number : list2) {
            System.out.println(number);
        }
    }
}

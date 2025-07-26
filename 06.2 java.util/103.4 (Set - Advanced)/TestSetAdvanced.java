import java.util.*;

public class TestSetAdvanced {
    public static void main(String[] args) {
        // 1. Create a HashSet and add Long objects
        Set<Long> hashSet = new HashSet<>();
        hashSet.add(44L);
        hashSet.add(11L);
        hashSet.add(22L);
        hashSet.add(33L);

        // 2. Print the unordered content of the HashSet
        System.out.println("Unordered content of the HashSet:");
        Iterator<Long> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Convert the HashSet to a List to sort it
        List<Long> list = new ArrayList<>(hashSet);

        // Sort the List
        Collections.sort(list);

        // Print the sorted content of the List
        System.out.println("\nSorted content of the hashSet List:");
        for (Long number : list) {
            System.out.println(number);
        }

        // Example usage of LinkedList
        LinkedList<Long> linkedList = new LinkedList<>();
        linkedList.add(100L);
        linkedList.add(90L);
        linkedList.add(110L);

         // Convert the linkedList to a List to sort it
        List<Long> list2 = new ArrayList<>(linkedList);

        // Sort the List
        Collections.sort(list2);

        // Print the sorted content of the List
        System.out.println("\nSorted content of the linkedList:");
        for (Long number : list2) {
            System.out.println(number);
        }
    }
}

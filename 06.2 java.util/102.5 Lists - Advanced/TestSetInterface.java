public class TestSetInterface {
    public static void main(String[] args) {
        MyCustomSet<String> mySet = new MyCustomSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");

        System.out.println("MyCustomSet contains: " + mySet);
        System.out.println("Size: " + mySet.size());

        mySet.remove("Banana");
        System.out.println("After removing Banana: " + mySet);
        
        System.out.println("Contains Apple? " + mySet.contains("Apple"));
        System.out.println("Is empty? " + mySet.isEmpty());
        
        mySet.clear();
        System.out.println("After clearing: " + mySet);
    }
}

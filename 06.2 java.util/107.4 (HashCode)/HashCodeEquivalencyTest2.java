public class HashCodeEquivalencyTest2 {
    public static void main(String[] args) {
        // Create two new String objects with the same content
        String a = new String("whatever");
        String b = new String("wherever");

        // Check if the strings are equal
        boolean equalsResult = a.equals(b);
        System.out.println("a.equals(b) = " + equalsResult);  // Expected: true

        // Check if the hash codes are equal
        boolean hashCodeResult = (a.hashCode() == b.hashCode());
        System.out.println("a.hashCode() == b.hashCode() = " + hashCodeResult);  // Expected: true
    }
}

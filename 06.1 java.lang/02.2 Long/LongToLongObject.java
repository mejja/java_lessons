public class LongToLongObject {
    public static void main(String[] args) {
        // Create a long primitive
        long primitiveLong = 123456789L;

        // Convert long to Long
        Long longObject = Long.valueOf(primitiveLong);

        // Standard output
        System.out.println("The long primitive value is: " + primitiveLong);
        System.out.println("The Long object is: " + longObject);
    }
}

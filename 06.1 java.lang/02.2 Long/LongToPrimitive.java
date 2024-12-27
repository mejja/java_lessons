public class LongToPrimitive {
    public static void main(String[] args) {
        // Create a Long instance
        Long longObject = 123456789L;

        // Convert Long to long
        long primitiveLong = longObject.longValue();

        // output
        System.out.println("The Long object is: " + longObject);
        System.out.println("The primitive long value is: " + primitiveLong);
    }
}

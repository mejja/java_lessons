public class StringToLongPrimitive {
    public static void main(String[] args) {
        String stringValue = "123456789";
        long longValue = Long.parseLong(stringValue);//use parseLong() for conversion

        // standard output
        System.out.println("The String value is: " + stringValue);
        System.out.println("The long primitive value is: " + longValue);
    }
}

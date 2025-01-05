public class StringToBoolean {
    public static void main(String[] args) {
        //String
        String stringValue = "true";

        // Convertion using valueOf() method
        Boolean booleanObject = Boolean.valueOf(stringValue);

        System.out.println("The String value is: " + stringValue);//string value
        System.out.println("The Boolean Object is: " + booleanObject);//boolean object
        
    }
}

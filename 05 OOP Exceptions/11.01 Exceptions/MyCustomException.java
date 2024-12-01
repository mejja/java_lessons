public class MyCustomException extends Exception {

    
    public static void main(String[] args) {
        try {
            // Throw the custom exception
            throw new MyCustomException("This is a custom exception message.");
        } catch (MyCustomException e) {
            // Handle the custom exception
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    // no-args constructor
    public MyCustomException() {
        super("Default message for MyCustomException");
    }

    // Constructor that accepts a custom message
    public MyCustomException(String message) {
        super(message);
    }

    // Constructor that accepts a custom message and a cause
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor that accepts a cause
    public MyCustomException(Throwable cause) {
        super(cause);
    }
}

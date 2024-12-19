//throwing both exceptions using java built-in tool addSuppressed();
public class ExceptionTest2 {
    public static void main(String[] args) throws Exception {
        try {
            m2();
        } catch (NewException e) {
            // If m2 throws NewException, catch it and store it
            try {
                m3(); // m3 can throw AnotherException
            } catch (AnotherException ae) {
                e.addSuppressed(ae); // Add AnotherException as a suppressed exception to NewException
            }
            throw e; // Throw the NewException, with AnotherException as a suppressed exception
        } finally {
            // The finally block can still do other cleanup, if needed
        }
    }

    public static void m2() throws NewException { throw new NewException(); }
    public static void m3() throws AnotherException { throw new AnotherException(); }
}

class NewException extends Exception {}
class AnotherException extends Exception {}

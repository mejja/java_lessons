public class App2 {
    public static void main(String[] args) {
        try {
            switch(Integer.parseInt(args[0])) {
                case 1:
                    System.out.println("CASE 1");
                    throw new IllegalStateException();
                case 2:
                    System.out.println("CASE 2");
                    throw new IllegalArgumentException();
                case 3:
                    System.out.println("CASE 3");
                    throw new RuntimeException();
                case 4:
                    System.out.println("CASE 4");
                    throw new NullPointerException();
                case 5:
                    System.out.println("CASE 5");
                    throw new ArrayIndexOutOfBoundsException();
                default:
                    System.out.println("DEFAULT");
                    throw new Exception();  // Checked exception
            }
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("FINALLY");
        }
    }
}

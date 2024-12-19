public class Switcher3 {
    public static void main(String[] args) {
        int someValue = Integer.parseInt(args[0]);
        //Code Example Without Separate Blocks:
        switch (someValue) {
            case 0:
                int x = 5;  // 'x' is declared here
                System.out.println("Case 0: x = " + x);
                break;

            case 1:
                // 'x' from case 0 is still in scope here
                x = 10;  // We are reassigning 'x' since it was already declared in case 0
                System.out.println("Case 1: x = " + x);
                break;

            case 2:
                // 'x' is still accessible here as it was declared in case 0
                System.out.println("Case 2: x = " + x);
                break;

            default:
                System.out.println("Default case");
                break;
        }
    }
}

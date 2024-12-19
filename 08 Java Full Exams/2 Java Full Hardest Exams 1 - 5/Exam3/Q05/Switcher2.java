public class Switcher2 {
    public static void main(String[] args) {
        int someValue = Integer.parseInt(args[0]);
        //Switch Example with Separate Blocks:
        switch (someValue) {
            case 0: {
                // Block for case 0
                int x = 5;  // 'x' is local to this block
                System.out.println("Case 0: x = " + x);
                break;
            }
            case 1: {
                // Block for case 1
                int x=20;//x can be redeclared and reassigned since is local to this block
                int y = 10;  // 'y' is local to this block
                System.out.println("Case 1: x = " + x);
                System.out.println("Case 1: y = " + y);
                break;
            }
            case 2: {
                // Block for case 2
                String message = "Hello from case 2";  // 'message' is local to this block
                System.out.println(message);
                break;
            }
        }
    }
}

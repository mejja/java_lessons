public class B2 extends A {
    int x = 15;  // This will be hidden, but doesn't affect A's x

    @Override
    int initialize() {
        return 20;  // Override to return 20
    }

    public static void main(String[] args) {
        A a = new B2();
        System.out.println(a.x);  // This will print the value of x initialized by the initialize() method
    }
}
class A {
    int x;

    A() {
        x = initialize();  // Assign x using the initialize() method
    }

    int initialize() {
        return 10;
    }
}



public class B4 extends A {
    @Override
    int initialize() {
        return 20;  // Return 20 when B is used
    }

    public static void main(String[] args) {
        A a = new B4();
        System.out.println(a.x);  // a.x will be initialized to 20
    }
}

class A {
    int x = initialize();  // x is initialized via the initialize() method

    int initialize() {
        return 10;
    }
}


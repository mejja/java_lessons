public class B3 extends A {
    int x = 15;

    @Override
    int initialize() {
        return 20;
    }

    public static void main(String[] args) {
        A a = new B3();
        // This will print 20 because B's initialize() is called
        System.out.println(a.initialize());  
    }
}

class A {
    int x = 5;

    A() {
        initialize();
    }

    int initialize() {
        return 10;
    }
}

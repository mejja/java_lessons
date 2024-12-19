class MyTest {
    public static void main(String[] args) {
        MySub ms = new MySub(10) { // Passing an integer value to the MySub constructor
            public void m1() {
                System.out.println("In MySub.m1()");
            }
        };
        ms.m1();
    }
}

class MySuper {
    public MySuper(int i) { 
        // Constructor with an integer parameter
    }
}

abstract class MySub extends MySuper {
    public MySub(int i) { 
        super(i); // Call the constructor of MySuper
    }
    public abstract void m1();
}

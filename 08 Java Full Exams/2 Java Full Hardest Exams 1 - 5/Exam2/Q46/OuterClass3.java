class OuterClass3 {
    // Non-functional interface (has more than one abstract method)
    interface Vehicle {
        void startEngine();  // Abstract method 1
        void stopEngine();   // Abstract method 2
    }
    // A static nested class that implements the non-functional interface
    static class Car implements Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Car engine started.");
        }
        @Override
        public void stopEngine() {
            System.out.println("Car engine stopped.");
        }
    }
    public static void main(String[] args) {
        // Creating an object of the Car class
        Vehicle myCar = new Car();

        myCar.startEngine();  // Output: Car engine started.
        myCar.stopEngine();   // Output: Car engine stopped.
    }
}

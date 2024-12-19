public class Test {
    public static void main(String[] args) {
        MyInterface.myStaticMethod(); // Calls the interface method
        MyClass.myStaticMethod(); // This would also call the static method from MyInterface
    }
}
interface MyInterface {
    static void myStaticMethod() {
        System.out.println("Static method in MyInterface");
    }
}
class MyClass implements MyInterface {
    // Shodowning of static method
    static void myStaticMethod() {
        System.out.println("Overridden static method in MyClass");
    }
    
}
//prints 
//Static method in MyInterface"
//Overridden static method in MyClass

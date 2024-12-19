public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        Child c2 = new Child();
        
        p.display(); // Output: Display from Parent
        c.display(); // Output: Display from Parent (not Child)
        
        Child.display(); // Output: Display from Child
        c2.display();//Output: Display from Child
    }
}
class Parent {
    static void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Display from Child");
    }
}

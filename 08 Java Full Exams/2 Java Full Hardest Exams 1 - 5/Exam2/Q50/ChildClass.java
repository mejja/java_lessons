package parentpackage;

public class ParentClass {
    protected String name = "ParentClass";

    protected void display() {
        System.out.println("Protected method in ParentClass");
    }
}
// In a different package (childpackage)
package childpackage;

import parentpackage.ParentClass;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        System.out.println(child.name);  // Accessible in the subclass (in different package)
        child.display();  // Accessible in the subclass (in different package)

        ParentClass parent = new ParentClass();
            System.out.println(parent.name);  // NOT accessible directly
            parent.display();  // NOT accessible directly
        ParentClass parentRef = new ChildClass();
            System.out.println(parentRef.name);  // NOT accessible directly
            parentRef.display();  // NOT accessible directly
    }
}

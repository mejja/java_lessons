package pkgB;

import pkgA.Foo;

public class Fiz extends Foo {
    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.print(" " + f.a);                      // Accessing a from Foo (valid)
        System.out.print(" " + f.b);                      // Accessing b from Foo (invalid)
        System.out.print(" " + new Fiz().a);              // Accessing a from Fiz (valid)
        System.out.println(" " + new Fiz().b);            // Accessing b from Fiz (valid)
    }
}

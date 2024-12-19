public class Main {
    public static void main(String[] args) {
        ConfidentialDocument c = new ConfidentialDocument("Top Secret", "High");
    }
}

// File: Printable.java
public interface Printable {
    void print();
    default void displayInfo() {
        System.out.println("This is a printable item.");
    }
}

// File: Scannable.java
public interface Scannable extends Printable {
    void scan();
    default void displayInfo() {
        System.out.println("This is a scannable item.");
    }
}

// File: Document.java
public class Document implements Scannable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }

    @Override
    public void displayInfo() {
        Scannable.super.displayInfo(); // Calls Scannable's default method
    }
}

// File: ConfidentialDocument.java
class ConfidentialDocument extends Document {
    private String securityLevel;

    ConfidentialDocument(String content, String securityLevel) {
        super(content);
        this.securityLevel = securityLevel;
    }

    @Override
    public void print() {
        System.out.println("Printing confidential document. Security level: " + securityLevel);
        super.print(); // Calls the print method in Document class
    }
}

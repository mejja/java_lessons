public class Banana{
    private String name;

    // Constructor to initialize the name
    public Banana(String name) {
        this.name = name;
    }

    // Override toString method to return the name of the Banana
    @Override
    public String toString() {
        return "Banana{name='" + name + "'}";
    }
}

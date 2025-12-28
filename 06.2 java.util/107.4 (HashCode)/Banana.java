import java.util.Objects;

/**
 * Represents a Banana with colour and size.
 * Properly overrides equals() and hashCode() for correct behavior in collections.
 */
public class Banana {

    private String colour;
    private int size;

    // Getter and Setter methods
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Two Banana objects are considered equal if they have the same colour and size.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Banana)) return false;
        Banana banana = (Banana) o;
        return size == banana.size &&
               Objects.equals(colour, banana.colour);
    }

    /**
     * Generates a hash code based on colour and size.
     * Must be consistent with equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(colour, size);
    }
}

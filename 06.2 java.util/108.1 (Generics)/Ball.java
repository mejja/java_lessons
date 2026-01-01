import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Demonstrates iterating over values in a HashMap using an Iterator.
 */
public class Ball {

    @Override
    public String toString() {
        return "ball";
    }

    public static void main(String[] args) {

        // Create a Map to store Ball objects with Integer keys
        Map<Integer, Ball> ballMap = new HashMap<>();

        // Add entries to the map
        ballMap.put(1, new Ball());
        ballMap.put(2, new Ball());
        ballMap.put(3, new Ball());
        ballMap.put(4, new Ball());

        // Obtain an iterator over the map's values
        Iterator<Ball> iterator = ballMap.values().iterator();

        // Iterate through the values and print each Ball
        while (iterator.hasNext()) {
            Ball ball = iterator.next();
            System.out.println(ball); // toString() is called implicitly
        }
    }
}

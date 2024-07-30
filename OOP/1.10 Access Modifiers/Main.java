import za.access.AccessMe;

public class Main {
    public static void main(String[] args) {
        AccessMe accessMe = new AccessMe();
        
        // Set the name property
        accessMe.setName("Major Mbandi");
        
        // Get the name property
        System.out.println("Name: " + accessMe.getName());
    }
}

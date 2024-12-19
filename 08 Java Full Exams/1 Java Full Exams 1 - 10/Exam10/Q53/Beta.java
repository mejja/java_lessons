public class Beta extends Baap {
    public int h = 44; // Instance variable in Beta
    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta(); // Creating a Beta object but referring to it as Baap
        System.out.println(b.h + " " + b.getH()); // Accessing h and calling getH()

        Beta bb = (Beta) b; // Casting b to Beta
        System.out.println(bb.h + " " + bb.getH()); // Accessing h and calling getH()
    }
}

class Baap {
    public int h = 4; // Instance variable in Baap
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}



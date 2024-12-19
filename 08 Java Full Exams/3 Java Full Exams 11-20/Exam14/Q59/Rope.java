public class Rope {
    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();  // Valid: static method calling another static method
        // climb();  // Invalid: static method cannot call a non-static method directly
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();  // Valid: calling a static method using an instance reference

        Rope rope2 = null;
        rope2.play();  // Valid: calling a static method using a null reference (no NullPointerException for static methods)
    }
}

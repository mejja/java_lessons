public class TestClass{
    public static void main (String args[]) {
    }
}
// Using int
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

// Using String
String fruit = "Apple";
switch (fruit) {
    case "Apple":
        System.out.println("This is an apple.");
        break;
    case "Banana":
        System.out.println("This is a banana.");
        break;
    default:
        System.out.println("Unknown fruit");
}

// Using Enum
enum Color {
    RED, GREEN, BLUE;
}
Color myColor = Color.RED;
switch (myColor) {
    case RED:
        System.out.println("Color is Red");
        break;
    case GREEN:
        System.out.println("Color is Green");
        break;
    default:
        System.out.println("Unknown Color");
}

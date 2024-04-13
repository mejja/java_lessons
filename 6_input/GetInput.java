import java.util.Scanner; //Import scanner utility

public class GetInput {
  public static void main(String[] args) {
    // Java Scanner String input example
    System.out.println("What is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();

    System.out.println("What is your surname?");
    String surname = scanner.nextLine();
    String fullName = name+ " " +surname;
    System.out.println("Hello " + fullName);

  }
}
import java.util.Scanner; //Import scanner utility

public class Concatenation {
  public static void main(String[] args) {
  Scanner Scanner = new Scanner(System.in);
  
  System.out.println("Enter the first Sentence!");
  String sentence1 = Scanner.nextLine();
  
  System.out.println("Enter the second Sentence");
  String sentence2 = Scanner.nextLine();

  String masterLine=  sentence1 + " "+ sentence2;
  System.out.println(masterLine);

}
}
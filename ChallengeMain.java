import java.util.Scanner; 

public class ChallengeMain{
	public static void main(String[] args){
String string;
while (true){
    string = Prompter.prompt("Enter the distance");
    boolean isNumValid = NumValidator.isNumeric(string);
if(!isNumValid) {
    System.out.println("Distance entered is not  numeric!");
    // Do something
} else {
    break;
}

}


		}
	}
import java.util.Scanner; //import the scanner class 

public class PrintRoses{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		// PrintRoses obj = new PrintRoses();

		int choice;
		do{
			System.out.println("==Anangram selector==");
			System.out.println("1. Roses Poem");
			System.out.println("2. Mr HW Sonnet");
			System.out.println("3. Grandchild's Sonnet");
			System.out.println("4.========Exit========");

			//Prompt user for input
			System.out.println("Enter your choice: ");
			choice = input.nextInt();
			switch (choice) {
				case 1:
					printRosesPoem();
				break;
				case 2:
					printMrHW();
				break;
				case 3:
					grandchild();
					break;
				case 4:
					System.out.println("Exiting...");
				break;
				default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);
		input.close();
	}

	public static void printRosesPoem(){
		String roses= "Roses are Red \nAnd so is Wine \nHoney is Sweet \nAnd so are you.";
		System.out.println(roses +"\n");
	}

	public static void printMrHW(){
		String title= "Shakespeare's sonnets";
		String author="William Shakespeare";
		String sonnet="TO.THE.ONLIE.BEGETTER.OF.\nTHESE.INSUING.SONNETS.\nMr.W.H. ALL.HAPPINESSE.\nAND.THAT.ETERNITIE.\nPROMISED.\nBY.\nOUR.EVER-LIVING.POET.\nWISHETH.\nTHE.WELL-WISHING.\nADVENTURER.IN.\nSETTING.\nFORTH.\nT.T.";
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println(sonnet + "\n");

	}
	public static void grandchild(){
		String title="A Grandchild's Guide to Using Grandpa's Computer";
		String author="Gene Ziegler";
		String poem="If a packet hits a pocket on a socket on a port,\nAnd the bus is interrupted as a very last resort,\nAnd the address of the memory makes your floppy disk abort \nThen the socket packet pocket has an error to report!";
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println(poem);
	}
}
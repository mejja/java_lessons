public class PrintRoses{
	public void printRosesPoem(){
		String roses= "Roses are Red \nAnd so is Wine \nHoney is Sweet \nAnd so are you.";
		System.out.println(roses);
	}
	public static void main(String[] args){
		PrintRoses obj = new PrintRoses();
		obj.printRosesPoem();
	}
}
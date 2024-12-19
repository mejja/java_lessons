public class ClownFish implements Fish {
	public String getNumberofGills() { return "4"; }
	public String getNumberofGills(int input) { return "6"; }
	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumberofGills(-1));
	}
}
interface Fish {
public default int getNumberofGills(int input) { return 2; }
}
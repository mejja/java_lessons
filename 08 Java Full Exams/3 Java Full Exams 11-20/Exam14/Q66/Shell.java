abstract class Insect implements Shell {
	abstract int getNumberofLegs();
	}
	public class Beetle extends Insect {
		int getNumberofLegs() { return 6; }
}
interface Shell {
	abstract int getNumberofSections();
}
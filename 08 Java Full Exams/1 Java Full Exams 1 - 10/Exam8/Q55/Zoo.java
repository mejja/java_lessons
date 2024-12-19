public class Zoo {
	public static void main(String[] args) throws Exception {
		Describe d = new Feline("Tiger");
		Runnable descriptionPrinter = () -> System.out.println(d.getDescription());
		descriptionPrinter.run();
	}
}

interface Describe {
	String getDescription();
}
class Creature implements Describe {
	private String kind;
	public Creature(String kind) {
		this.kind = kind;
	}
	public String getDescription() { return kind; }
}
class Feline extends Creature {
private String kind;
public Feline(String kind) {
	super(kind);
	this.kind = "Cat: " + kind;
}
@Override
public String getDescription() { return kind; }
}

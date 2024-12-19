public class Office {
	public static void main(String[] args) throws Exception {
	Namer n = new Worker("Joseph");
	Runnable nameDisplay = () -> System.out.println(n.getName());
	nameDisplay.run();
	}
}

interface Namer {
	String getName();
}
class Individual implements Namer {
	private String name;
	public Individual(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	}
class Worker extends Individual {
	private String name;
	public Worker(String name) {
	super (name) ;
		this.name = "Employee Name: " + name;
	}
	@Override
	public String getName() { return name; }
}
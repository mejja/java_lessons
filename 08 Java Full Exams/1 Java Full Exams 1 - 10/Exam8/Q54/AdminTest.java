public class AdminTest {
	public static void main(String[] args) throws Exception {
		Identifiable i = new AdminAccount("root");
		System.out.println(i.getIdentifier());
	}
}

interface Identifiable {
	String getIdentifier();
}
class Account implements Identifiable {
	private String identifier;
	public Account(String identifier) {
	this. identifier = identifier;
}
public String getIdentifier() { return identifier; }
}
class AdminAccount extends Account {
	private String identifier;
	public AdminAccount(String identifier) {
	super(identifier);
	this. identifier = "Admin ID: " + identifier;
}
@Override
public String getIdentifier() { return identifier; }
}

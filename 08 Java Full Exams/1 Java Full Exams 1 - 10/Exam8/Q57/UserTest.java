public class UserTest {
	public static void main(String[] args) throws Exception {
		Identifiable i = new Admin("admin123");
		// PRINT ID HERE
		System.out.println(((User) i).id);
	}
}

interface Identifiable {
	String getId();
}
class User implements Identifiable {
	private String id;
	public User(String id) {
		this.id = id;
	}
	public String getId() { return id; }

}

class Admin extends User {
	public Admin(String id) {
		super (id);
	}
}

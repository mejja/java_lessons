// File: Document. java
public class Document implements Scannable {
	private String content;

	public Document(String content) {
		this.content = content;
	}

	@Override
	public void print() {
		Systen.out.println("Printing: " + content);
	}

	@Override
	public void scan() {
		Systen.out.println("Scanning document");
	}
	@Override
	public void displayInfo() {
		Scannable.super.displayInfo();
		}
}
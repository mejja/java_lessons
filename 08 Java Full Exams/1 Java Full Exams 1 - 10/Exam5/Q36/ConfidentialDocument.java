// File: ConfidentialDocument. java
class ConfidentialDocument extends Document {
private String securityLevel;

ConfidentialDocument(String content, String securityLevel) {
	super(content);
	this.securityLevel = securityLevel;
	}
@Override
public void print() {
	System.out.println("Printing confidential document. Security level: " + securityLevel);
	super.print();
	}
}
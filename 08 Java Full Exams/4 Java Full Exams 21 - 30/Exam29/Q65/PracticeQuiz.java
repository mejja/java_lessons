public class PracticeQuiz extends Quiz implements Event {
	public void details() {
		System.out.print(type);
}

public static void main(String[] args) {
	new PracticeQuiz().details();
	System.out.print(""+ type);
	}
}

interface Event {
	String type ="Event";
	public void details();
}
class Quiz {
	static String type = "Quiz";
}

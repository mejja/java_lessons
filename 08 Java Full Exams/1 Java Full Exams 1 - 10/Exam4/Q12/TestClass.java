public class TestClass{
	public static void main(String [] args){
		TestClass n = new TestClass();
		n.crazyLoop();
		}
		void crazyLoop () {
			int c = 0;
				JACK: while (c < 8) {
				JILL: System.out.println (c);
				if (c > 3) break JILL; else c++;
			}
		}
}
public class Tester {
	static void method() throws Exception {
		throw new Exception();
	}
	public static void main(String[] args) {
		try {
			method();
		} catch (Throwable e) {
			try {
				throw new Exception() ;
			} catch (Exception ex) {
				System. out.print("exception");
			} finally {
				System.out.print("finally");
			}
		}
	}
}
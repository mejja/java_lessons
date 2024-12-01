class TestClass {
	public static void main(String[] args) {
	try{
		amethod();
		System.exit(0);
	}catch (Exception e){
		System.out.println("catch");
	}finally {
		System.out.println("finally");
	}
	System.out.println("out");
	}
	public static void amethod(){}
}
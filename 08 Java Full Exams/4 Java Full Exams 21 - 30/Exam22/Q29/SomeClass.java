class SomeClass{
	String s1 = "green mile"; // 0
	String local; // 1
	public void generateReport( int n ){
		
		if( n> 0) local = "good"; //2
		System.out.println( s1+" = " + local );
	}
	public static void main(String[] args){
		new SomeClass().generateReport(1);
	}
}
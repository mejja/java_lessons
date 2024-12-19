class Test{
	public static void main (String [] args) throws Exception{
		int [] a = null;
		int i = a [ m1() ];//intterrupt normal flow with Exception thrown m1()
	}
	public static int m1() throws Exception{//Exception is thown and print Some 
		throw new Exception ("Some Exception") ;
	}
}
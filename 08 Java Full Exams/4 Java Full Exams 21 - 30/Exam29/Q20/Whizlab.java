class Whizlab{
	Integer I;
	public static void main(String args[]){
			String s;

		try{

			s = new Whizlab().I.toString();

		}finally{

			try{
				int i = Integer.parseInt(args[0]);

			}catch(NumberFormatException E){
				System.out.print("NumberFormat ");

			}finally{
				System.out.print("Fin2");
			}	
		System.out.print("Fin1");
		}
	}
}
/*And the given command line invocation is java Whizlab A
What is the output?*/


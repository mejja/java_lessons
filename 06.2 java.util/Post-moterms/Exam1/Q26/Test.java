class Test{
	public static void main(String [ ] args){
		if (args.length == 1 | args[1].equals("debug")){
			System.out.println(args[0]);
		}
		else{
		   System.out.println("Release");
		 }
	}
}
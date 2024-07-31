public class NumberValidator{
	public static boolean opIsValid(String op){
		double intValue;
		if(op == null || op.equals("")){
			System.out.println("String cannot be parsed, it is null or empty.");
			return false;
		}

		//Try & Catch block
		try{
			intValue = Double.parseDouble(op);
			return true;
		} catch(NumberFormatException e){}

	return false;
	}
}
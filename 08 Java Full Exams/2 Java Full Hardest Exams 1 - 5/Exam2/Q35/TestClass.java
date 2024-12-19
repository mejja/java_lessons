public class TestClass{
	public static void main(String[] args){

	}
}

interface Account{
	public default String getId(){
		return "0000";
	}
}
interface PremiumAccount extends Account{
	default String getId(){ return "1111"; }
}
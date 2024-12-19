interface PremiumAccount extends Account{
	//INSERT CODE HERE
	static String getId(){ return "1111"; }
}
interface Account{
	public default String getId(){
		return "0000";
	}
}
//Which of the following options can be inserted in PRemiumAccount independed of each other?
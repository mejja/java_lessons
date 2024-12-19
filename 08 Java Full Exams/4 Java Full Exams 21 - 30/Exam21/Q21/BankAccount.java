public class BankAccount implements PremiumAccount{
	public static void main(String[] args) {
		Account acct = new BankAccount();
		System.out.println(acct.getId());
	}
}
interface Account{
	public default String getId(){
		return "0000";
	}
}
interface PremiumAccount extends Account{
	public String getId();
}
//Which statements about the following code contained in BankAccounts.java are correct?
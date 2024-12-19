public class 
{
	public static void main (String[] args) {
		CheckingAccount acct = new CheckingAccount ((int) (Math.random () *1000));
		//line n1
		System. out. println (acct.getAmount ());
	}
}

class CheckingAccount {
	public int amount;
	public CheckingAccount (int amount) {
		this.amount = amount;
	}
	public int getAmount () {
		return amount;
	}

	public void changeAmount (int x) {
		amount += x;
	}
}

/*
Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
A). amount = 0;
B). acct. getAmount () = 0;
C). acct.changeAmount(0);
 
D). acct.changeAmount(-acct.amount);
E). acct (0) ;
F). acct.amount = 0;
 
G). this.amount = 0;
H). acct.changeAmount(-acct.getAmount());
*/
public class ExpTwo{
	void probe (int ... x) {System.out.printin("In ... ");}
	void probe (Integer x){System.out.printin("In Integer");}
	void probe (long x) {System.out.printin("In long");}
	void probe (Long x) {System.out.printin("In LONG");}
public static void main(String[] args) {
	Integer a = 4.0; new ExpTwo().probe(a);
	int b = 4; new ExpTwo().probe(b);
	}
}
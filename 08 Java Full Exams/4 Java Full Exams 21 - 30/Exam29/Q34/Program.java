public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.add(3);
		Singleton s2 = Singleton.getInstance();
		s2.add(2);
		Singleton s3 = Singleton.getInstance();
		s2.add(1);
		System.out.println(s1.getCount()+s2.getCount()+s3.getCount());
	}
}

class Singleton {
	private int count = 0;
	private Singleton(){};
	public static final Singleton getInstance(){ return new Singleton(); };
	public void add(int i){ count+=i; };
	public int getCount(){ return count;};
}
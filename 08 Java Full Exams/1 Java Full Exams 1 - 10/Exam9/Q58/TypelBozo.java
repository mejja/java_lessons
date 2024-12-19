public class TypelBozo implements Bozo{
	public TypelBozo () {
		type = 1;
	}
	public void jump() {
		System.out.println("jumping ... "+type) ;
	}
	public static void main(String[] args) {
	Bozo b = new TypelBozo() ;
	b.jump();
	}
}

interface Bozo{
	int type =0;
	public void jump();
}
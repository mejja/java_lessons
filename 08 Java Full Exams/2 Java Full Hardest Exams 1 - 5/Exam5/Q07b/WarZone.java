public class WarZone {
	public static void main (String[] args) {
		XMen x = null;
		if (args.length > 0) {
			x = new XMen () {
			public void shoot (String s) {
				for (int i=0; i<s.length(); i++) {
					System.out.println ("shot : "+s.charAt (i));
				}
			}
		};
	}
	if (x != null) {
		x.shoot (args [0]) ;
	}

	}
}
interface XMen {
	void shoot (String a) ;
}
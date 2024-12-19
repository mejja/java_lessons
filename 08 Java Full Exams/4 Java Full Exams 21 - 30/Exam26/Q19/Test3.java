public class Test3 {
	public static void main (String[] args) {
		Z obj = new z () ;
		System. out.println (obj.x3 + ", " + obj.y1 + ", "+ obj.z1);
	}
}

class X {
	int x1, x2, x3;
}

class Y extends X {
	int yl;
	Y(){
		x1=1;
		x2= 2;
		yl = 10;
	}
}

class Z extends Y {
	int z1;
	Z (){
		x1 = 3;
		yl = 20;
		Z1 = 100;
	}
}
//Which constructor initializes the variable x3?


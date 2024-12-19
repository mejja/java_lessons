public class Tester{
	public static void main(String ... args) {
		Z obj = new Z();
		System.out.println(obj.x3 +", "+ obj.y1 +","+ obj.z1);
	}
}
class X{
	int x1, x2, x3;
}
class Y extends X{
	int y1;
	Y(){
		x1 = 1;
		x2 = 2;
		y1 = 10;
	}
}
class Z extends Y {
	int z1;
	Z(){
		x1 = 3;
		y1 = 20;
		z1 = 100;
	}
}


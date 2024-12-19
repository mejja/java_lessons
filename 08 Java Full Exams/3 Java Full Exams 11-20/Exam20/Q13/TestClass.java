public class TestClass {
	public static void main(String[] args) throws Exception {
		Game g = new Soccer();
		g.play(); //1
		Soccer s = (Soccer)g;
		s.play(); // 2
	}
}

class Game {
	public void play() throws Exception{
		System.out.println("Playing ... ");
	}
}
class Soccer extends Game {
	public void play(String ball){
		System.out.println("Playing Soccer with "+ball);
	}
}

public class Soccer extends Game{
	public void play( ){
		System. out. println( "Playing Soccer ... ");
	}
	public static void main(String[ ] args){
		Game g = new Soccer();
		g.play( );
	}
}
class Game{
	public void play() throws Exception{
		System. out. println( "Playing ... ");
	}
}

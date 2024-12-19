public class Noobs{
	public Noobs(){
		try{
			throw new Exception();
		}catch(Exception e){

		}
	}

	public static void main(String[] args){
		Noobs a = new Noobs();
		Noobs b = new Noobs();
		Noobs c= a;
	}
}
class Exception extends Exception{

}
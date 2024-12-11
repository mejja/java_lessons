public class Q09{
	int x=5;
		int getX(){return x;}
	public static void main (String[] args){
		Q09 m= new Q09();
		m.looper();
		System.out.println(m.x);
	}
	public void looper(){
		int x=0;
		while((x= getX()) !=0){
			for(int m=10; m>=0; m--){
				x=m;
			}
		}
	}
}
public class Q04{
	public static void loopTest(int x){
	loop: for(int i=1;i<5;i++){
			for(int j=1;j<5; j++){
				System.out.println(i);
				if(x==0){
					continue loop;
				}
				System.out.println(j);
			}
		}
	}
	public static void main (String[] args){
        loopTest(0);
	}
}
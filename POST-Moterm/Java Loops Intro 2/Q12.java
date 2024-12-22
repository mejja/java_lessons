public class Q12 {
public static void main(String[] args) {
	for(char i=0, j= 1; i<5 && j<6; i++){
		System.out.println((int)i+ " "+ (int)j+",");
		j++;
	}
	System.out.println("Loop two");
	for(int i=0, j= 1; i<5 && j<6; i++){
		System.out.println(i+ " "+ j+",");
		j++;
	}
	

}
	
}
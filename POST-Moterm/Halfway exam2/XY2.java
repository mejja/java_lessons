public class XY2{
	public static void main(String[] args){
		// int a =10; int b = 20; boolean c =false;
		// if (b>a) if (++a == 10) if (c! =true) System.out.println(1);
		// else System.out.println(2); else System.out.println(3);

		// int y = 0;
		// for (int x = 0; y<5; ++x){
		// 	if(x%2 == 0)
		// 		continue;
		// 	y +=x;
		// }
		// System.out.println(y);

		// int y= 0;
		// for (; ;){
		// 	if(y>=10) break;
		// 	y += y++;
		// }
		// System.out.println(y);


		// int[] [] tablecells ={{1,2,3,4}, {5,6,7,8}, {9,10,11}};
		// System.out.println(tablecells[1][3]);

		int [] [] stickers = new int[4][];
		for (int i=0; i<stickers.length; i++){
			stickers[i]= new int[4];
		}
		System.out.println(stickers[0][0]);
	 }

}